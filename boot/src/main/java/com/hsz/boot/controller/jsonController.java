package com.hsz.boot.controller;

import com.alibaba.fastjson.JSON;
import com.hsz.bootentity.TestVO;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

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
    public Object test() {
        TestVO testVO = new TestVO();
        testVO.setName("test");
        testVO.setXxList(Collections.singletonList("t"));
        testVO.setxAxis(Collections.singletonList("t"));
        testVO.setName(null);
        //System.out.println(JSON.toJSONString(testVO));
        return testVO;
    }
}
