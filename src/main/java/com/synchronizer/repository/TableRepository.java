package com.synchronizer.repository;

import com.synchronizer.entity.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TableRepository extends JpaRepository<Table, String> {
    @Query(value = "SELECT\n" +
            "   table_name\n" +
            "FROM\n" +
            "    information_schema.tables\n" +
            "WHERE\n" +
            "    table_type = 'BASE TABLE'\n" +
            "AND\n" +
            "    table_schema NOT IN ('pg_catalog', 'information_schema');", nativeQuery = true)
    List<String> getAllTables();


}
