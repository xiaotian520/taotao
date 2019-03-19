package com.taotao.controller;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItemController {

    //2.注入服务
    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/item/list",method = RequestMethod.GET)
    @ResponseBody
    public EasyUIDataGridResult getItemList(Integer page, Integer rows){
        //1.引入服务(springmvc.xml)
        //3.调用业务方法
        return itemService.getItemList(page, rows);
    }

}
