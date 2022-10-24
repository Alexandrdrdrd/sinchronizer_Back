package com.synchronizer.entity;

import java.util.List;
import java.util.Map;

public class TableMetadata {
    private String table;
    private Map<String, Boolean> columnList;

    public TableMetadata(String table, Map<String, Boolean> columnList) {
        this.table = table;
        this.columnList = columnList;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public Map<String, Boolean> getColumnList() {
        return columnList;
    }

    public void setColumnList(Map<String, Boolean> columnList) {
        this.columnList = columnList;
    }

    @Override
    public String toString() {
        return "TableMetadata{" +
                "table=" + table +
                ", columnList=" + columnList +
                '}';
    }
}
