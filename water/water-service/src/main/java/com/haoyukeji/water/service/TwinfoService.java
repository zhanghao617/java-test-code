package com.haoyukeji.water.service;

import com.haoyukeji.water.entity.TWinfo;

import java.util.List;

public interface TwinfoService {


    /**
     * 查询水电费价格
     * @return
     */
    List<TWinfo> findAll();

    /**
     * 添加新的水电费价格
     */
    void saveNewPrice(TWinfo tWinfo);

    /**
     * 根据水电费的序号查询该记录
     * @param wid
     * @return
     */
    TWinfo findPriceById(Integer wid);

    /**
     * 修改价格
     * @param tWinfo
     */
    void updatePrice(TWinfo tWinfo);

    /**
     * 删除价格记录
     * @param id
     */
    void delPriceById(Integer id);
}
