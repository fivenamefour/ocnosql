package com.ailk.oci.ocnosql.entity;

/**
 * Created with IntelliJ IDEA.
 * User: yutao3
 * Date: 13-1-22
 * Time: 上午9:31
 * To change this template use File | Settings | File Templates.
 */
public class Table {
    private Long tableId;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    private String tableName;

    public Long getTableId() {
        return tableId;
    }

    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }
}
