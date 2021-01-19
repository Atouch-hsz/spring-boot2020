package com.hsz.bootentity.bo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author created by hsz 2021/1/11 14:56
 */
@Data
public class QueryBO {
    private String serviceCode;

    private String source;

    private String target;
}
