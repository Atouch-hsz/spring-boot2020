package com.hsz.bootentity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author created by hsz 2021/1/11 16:57
 */
@Data
public class MonthlyMarketingVO {
    @ApiModelProperty("用电户号")
    private String consNo;

    @ApiModelProperty("电费月份")
    private String amtMonth;

    @ApiModelProperty("发行日期")
    private String releaseDate;

    @ApiModelProperty("费用类型：输配电费 交易费 违约费 偏差考核费 容量补偿费 其他")
    private String typeFee;

    @ApiModelProperty("电量")
    private BigDecimal elePq;

    @ApiModelProperty("价格")
    private BigDecimal elePrice;

    @ApiModelProperty("金额")
    private BigDecimal fee;
}
