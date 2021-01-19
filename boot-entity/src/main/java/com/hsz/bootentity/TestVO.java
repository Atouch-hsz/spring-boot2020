package com.hsz.bootentity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @author created by hsz 2020/11/23 11:38
 */
@Data
public class TestVO {

    @JsonProperty("xAxis")
    private String xAxis;

    private String yAxis;

    public String getyAxis() {
        return yAxis;
    }

    public void setyAxis(String yAxis) {
        this.yAxis = yAxis;
    }
}
