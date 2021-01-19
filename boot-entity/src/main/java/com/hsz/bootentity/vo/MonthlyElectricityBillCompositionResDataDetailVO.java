package com.hsz.bootentity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author created by hsz 2021/1/11 16:35
 */
@Data
public class MonthlyElectricityBillCompositionResDataDetailVO {
    @ApiModelProperty("用电户号")
    private String consNo;

    @ApiModelProperty("电费月份")
    private String amtMonth;

    @ApiModelProperty("发行日期")
    private String releaseDate;

    @ApiModelProperty("目录电费")
    private BigDecimal kwhAmt;

    @ApiModelProperty("基本电费")
    private BigDecimal baseAmt;

    @ApiModelProperty("基本电费计算方式")
    private String baCalcMode;

    @ApiModelProperty("代征电费")
    private BigDecimal plAmt;

    @ApiModelProperty("力率电费")
    private BigDecimal adjAmt;
}
