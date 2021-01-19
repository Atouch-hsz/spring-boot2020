package com.hsz.boot.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hsz.bootentity.TestVO;
import org.springframework.web.bind.annotation.*;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author created by hsz 2020/11/23 11:14
 */
@RestController
@RequestMapping("/json")
public class jsonController {
    @GetMapping("/index")
    public String index() {
        return "hello";
    }

    @GetMapping("/test")
    public Object test() throws Exception {
        BeanInfo beanInfo = Introspector.getBeanInfo(TestVO.class);
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        List<String> names = new ArrayList<>();
        for (int i = 0; i < propertyDescriptors.length; i++) {
            String name = propertyDescriptors[i].getName();
            names.add(name);
        }

        TestVO testVO = new TestVO();
        testVO.setyAxis("y");
        testVO.setXAxis("x");
        String o = JSON.toJSONString(testVO);
        String s = new ObjectMapper().writeValueAsString(testVO);


        return testVO;
    }
}
