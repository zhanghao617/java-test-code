package com.haoyukeji.water.service.impl;

import com.haoyukeji.water.entity.TMinfo;
import com.haoyukeji.water.entity.TMinfoExample;
import com.haoyukeji.water.mapper.TMinfoMapper;
import com.haoyukeji.water.service.TminfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TminfoServiceImpl implements TminfoService {

    @Autowired
    private TMinfoMapper tMinfoMapper;

    /**
     * 查询所有的用户信息
     * @return
     */
    @Override
    public List<TMinfo> findAllConsumer() {
        return tMinfoMapper.selectByExample(new TMinfoExample());
    }


    /**
     * 根据客户id查询消耗水电信息
     * @param id
     * @return
     */
    @Override
    public TMinfo findConsumerById(Integer id) {
        return tMinfoMapper.selectByPrimaryKey(id);
    }

    /**
     * 修改用户消耗水电（慎重）
     * @param tMinfo
     */
    @Override
    public void updateConsumer(TMinfo tMinfo) {
        tMinfoMapper.updateByPrimaryKeySelective(tMinfo);
    }

    /**
     * 缴费 | 修改当前金额
     * @param tMinfo
     */
    @Override
    public void saveEletricmoney(TMinfo tMinfo) {
        tMinfoMapper.updateByPrimaryKeySelective(tMinfo);
    }
}
