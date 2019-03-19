package com.taotao.controller;

import com.taotao.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试使用的Controller 查询当前的时间
 */
@Controller
public class TestController {

    //2. 注入服务
    @Autowired
    private TestService testService;

    @RequestMapping("queryNow")
    @ResponseBody
    public String queryNow(){
        //1. 引入服务 在springmvc.xml中
        //2. 注入服务
        //3. 调用服务方法
        return testService.queryNow();
    }
}
