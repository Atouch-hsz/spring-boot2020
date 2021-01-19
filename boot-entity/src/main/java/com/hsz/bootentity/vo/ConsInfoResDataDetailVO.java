package com.hsz.bootentity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author created by hsz 2021/1/11 16:16
 */
@Data
public class ConsInfoResDataDetailVO {

    @ApiModelProperty("用电户号")
    private String consNo;

    @ApiModelProperty("用电户号名称")
    private String consName;

    @ApiModelProperty("供电单位")
    private String orgNo;

    @ApiModelProperty("行政区域")
    private String countyCode;

    @ApiModelProperty("行业类型")
    private String tradeCode;

    @ApiModelProperty("行业类型Code")
    private String tradeCodeValue ;

    @ApiModelProperty("合同容量")
    private String contractCap;

    @ApiModelProperty("运行容量")
    private String runCap;

    @ApiModelProperty("电压等级")
    private String voltCode;

    @ApiModelProperty("是否为高压用户 01 高压 02低压非居民 03 低压居民")
    private String consSortCode;

    @ApiModelProperty("用电类别 ")
    private String elecTypeCode;

    @ApiModelProperty("用电地址")
    private String elecAddr;

    @ApiModelProperty("是否市场化交易用户")
    private String marketFlag;

    @ApiModelProperty("市场化交易类型")
    private String marketPropSort;

    @ApiModelProperty("电气联系人")
    private String elecContactor;

    @ApiModelProperty("电气联系人联系电话")
    private String elecContactorMobile;

    @ApiModelProperty("账务联系人")
    private String accountContactor;

    @ApiModelProperty("账务联系人联系电话")
    private String accountContactorMobile;
}
