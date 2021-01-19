package com.hsz.bootentity.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author created by hsz 2021/1/11 15:01
 */
@Data
public class MonthlyBillResDataDetailVO {
    private String consNo;

    private String amtMonth;

    private BigDecimal settlePq;

    private BigDecimal settleAmt;

    private BigDecimal avgPrc;
}
