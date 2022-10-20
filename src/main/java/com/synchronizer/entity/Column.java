package com.synchronizer.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Column {

    @Id
    @javax.persistence.Column(name = "column_name")
    String columnName;


    public Column() {
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }


    @Override
    public String toString() {
        return "Columns{" +
                "columnName='" + columnName + '\'' +
                '}';
    }
}
