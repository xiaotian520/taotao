package com.taotao.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    //1. 注入mapper
    @Autowired
    private TbItemMapper tbItemMapper;

    @Override
    public EasyUIDataGridResult getItemList(@Value("1") Integer page, @Value("30") Integer rows) {
        //2. 设置分页信息  使用pageHelper
        PageHelper.startPage(page,rows);
        //3. 创建example 对象  不用设置查询条件(默认查所有)
        TbItemExample example = new TbItemExample();
        //4. 根据mapper调用查询所有数据的方法
        List<TbItem> list = tbItemMapper.selectByExample(example);
        //5. 获取分页信息
        PageInfo<TbItem> info = new PageInfo<>(list);
        //6. 封装到EasyUIDataGridResult
        EasyUIDataGridResult result = new EasyUIDataGridResult();
        result.setTotal((int) info.getTotal());
        result.setRows(info.getList());
        //7. 返回
        return result;
    }
}
