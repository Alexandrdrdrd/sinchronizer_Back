package com.synchronizer.repository;

import com.synchronizer.entity.Column;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ColumnRepository extends JpaRepository<Column, String> {

    @Query(value = "SELECT\n" +
            "     column_name\n" +
            "FROM\n" +
            "    information_schema.columns\n" +
            "WHERE\n" +
            " table_name = ?1 "+
            "AND\n" +
            "    table_schema NOT IN ('pg_catalog', 'information_schema');", nativeQuery = true)
    List<String> getAllColumnByTableName(String name);

}
