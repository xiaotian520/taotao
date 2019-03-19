package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 显示页面
 */
@Controller
public class PageController {

    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }

    //显示商品的查询页面
    // 传进来的参数是{page} 给了PathVariable注解后 返回就可以直接返回page
    // 传的是item-list 返回就是item-list
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }
}
