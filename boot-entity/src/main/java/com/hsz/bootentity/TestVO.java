package com.hsz.bootentity;

import lombok.Data;

import java.util.List;

/**
 * @author created by hsz 2020/11/23 11:38
 */

public class TestVO {
    private List<String> xxList;

    private List<String> yList;

    private List<String> xAxis;

    public List<String> getXxList() {
        return xxList;
    }

    public void setXxList(List<String> xxList) {
        this.xxList = xxList;
    }

    public List<String> getyList() {
        return yList;
    }

    public void setyList(List<String> yList) {
        this.yList = yList;
    }

    public List<String> getxAxis() {
        return xAxis;
    }

    public void setxAxis(List<String> xAxis) {
        this.xAxis = xAxis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
