package com.hsz.bootentity.vo;

import lombok.Data;

import java.util.List;

/**
 * @author created by hsz 2021/1/11 15:03
 */
@Data
public class DataCenterResDataBaseVO<T> {
    private String rtnCode;

    private String rtnMsg;

    private List<T> detail;
}
