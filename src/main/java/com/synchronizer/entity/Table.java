package com.synchronizer.entity;

import javax.persistence.*;

@Entity
public class Table {

    @Id
    String tableName;


    public Table() {
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }


    @Override
    public String toString() {
        return "TableInfo{" +
                "tableName='" + tableName + '\'' +
                ", columns=" +
                '}';
    }
}
