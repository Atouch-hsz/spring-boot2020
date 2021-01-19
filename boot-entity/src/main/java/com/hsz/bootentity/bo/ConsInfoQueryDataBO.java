package com.hsz.bootentity.bo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author created by hsz 2021/1/11 16:15
 */
@Data
public class ConsInfoQueryDataBO {
    @ApiModelProperty("数据中台项目标识")
    private String project;

    @ApiModelProperty("单位编码")
    private String orgNo = "37010";

    @ApiModelProperty("服务编码")
    private String account = "sysadmin";

    @ApiModelProperty("服务编码")
    private String serviceCode;

    @ApiModelProperty("用电户号")
    private List<String> consNo;
}
