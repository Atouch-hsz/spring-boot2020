package com.hsz.bootentity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author created by hsz 2021/1/11 16:30
 */
@Data
public class MonthlyPeakAndValleyRatioResDataDetailVO {
    @ApiModelProperty("用电户号")
    private String consNo;

    @ApiModelProperty("电费月份")
    private String amtMonth;

    @ApiModelProperty("抄表日期")
    private String mrDate;

    @ApiModelProperty("尖段用电总量")
    private BigDecimal pq1;

    @ApiModelProperty("峰段用电总量")
    private BigDecimal pq2;

    @ApiModelProperty("平段用电总量")
    private BigDecimal pq3;

    @ApiModelProperty("谷段用电总量")
    private BigDecimal pq4;
}
