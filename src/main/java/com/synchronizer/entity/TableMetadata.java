package com.synchronizer.entity;

import java.util.List;

public class TableMetadata {
    private String table;
    private List<String> columnList;

    public TableMetadata(String table, List<String> columnList) {
        this.table = table;
        this.columnList = columnList;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public List<String> getColumnList() {
        return columnList;
    }

    public void setColumnList(List<String> columnList) {
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
