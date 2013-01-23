package com.ailk.oci.ocnosql.entity;

/**
 * Created with IntelliJ IDEA.
 * User: yutao3
 * Date: 13-1-22
 * Time: 上午9:31
 * To change this template use File | Settings | File Templates.
 */
public class View {
    private Long viewId;

    private String viewName;

    public Long getViewId() {
        return viewId;
    }

    public void setViewId(Long viewId) {
        this.viewId = viewId;
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }
}
