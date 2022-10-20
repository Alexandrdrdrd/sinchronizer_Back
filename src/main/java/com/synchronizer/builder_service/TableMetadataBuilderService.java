package com.synchronizer.builder_service;

import com.synchronizer.entity.Column;
import com.synchronizer.entity.Table;
import com.synchronizer.entity.TableMetadata;
import com.synchronizer.repository.ColumnRepository;
import com.synchronizer.repository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TableMetadataBuilderService {
    TableRepository tableRepository;
    ColumnRepository columnRepository;

    @Autowired
    public TableMetadataBuilderService(ColumnRepository columnRepository, TableRepository tableRepository){
        this.tableRepository = tableRepository;
        this.columnRepository = columnRepository;
    }

    public  List<TableMetadata> build() {
        List<TableMetadata> tableMetadata = new ArrayList<>();
        List<String> tableNames = tableRepository.getAllTables();
        tableNames.forEach(name -> {
            List<String> columns = columnRepository.getAllColumnByTableName(name);
            tableMetadata.add(new TableMetadata(name,columns));
        });
        return tableMetadata;

    }
}
