package com.hsz.bootentity.bo;

import lombok.Data;

/**
 * @author created by hsz 2021/1/11 14:58
 */
@Data
public class DataCenterQueryBaseBO<T> extends QueryBO {
    private T data;
}
