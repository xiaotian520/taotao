package com.taotao.service;

import com.taotao.common.pojo.EasyUIDataGridResult;

/**
 *  商品相关的处理的Service
 */
public interface ItemService {

    /**
     * 根据页码和行数进行分页查询
     * @param page
     * @param rows
     * @return
     */
    public EasyUIDataGridResult getItemList(Integer page,Integer rows);
}
