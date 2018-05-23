package com.haoyukeji.water.service;

import com.haoyukeji.water.entity.TMinfo;

import java.util.List;

public interface TminfoService {

    /**
     * 查询所有的用户信息
     * @return
     */
    List<TMinfo> findAllConsumer();

    /**
     * 根据客户id查询消耗水电信息
     * @param id
     * @return
     */
    TMinfo findConsumerById(Integer id);

    /**
     * 修改用户消耗水电（慎重）
     * @param tMinfo
     */
    void updateConsumer(TMinfo tMinfo);

    /**
     * 缴费 | 修改当前金额
     * @param tMinfo
     */
    void saveEletricmoney(TMinfo tMinfo);
}
