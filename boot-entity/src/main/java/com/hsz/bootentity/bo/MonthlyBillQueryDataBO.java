package com.hsz.bootentity.bo;

import lombok.Data;

import java.util.List;

/**
 * @author created by hsz 2021/1/11 15:09
 */
@Data
public class MonthlyBillQueryDataBO {
    private String project;

    private String orgNo;

    private String account;

    private String serviceCode;

    private String amtMonth;

    private List<String> consNo;
}
