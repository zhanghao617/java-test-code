package com.haoyukeji.water.service.impl;

import com.haoyukeji.water.entity.TWinfo;
import com.haoyukeji.water.entity.TWinfoExample;
import com.haoyukeji.water.mapper.TWinfoMapper;
import com.haoyukeji.water.service.TwinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TwinfoServiceImpl implements TwinfoService {

    @Autowired
    private TWinfoMapper tWinfoMapper;

    /**
     * 查询水电费价格
     * @return
     */
    @Override
    public List<TWinfo> findAll() {
        TWinfoExample tWinfoExample = new TWinfoExample();
        return tWinfoMapper.selectByExample(tWinfoExample);
    }

    /**
     * 添加新的水电费价格
     */
    @Override
    public void saveNewPrice(TWinfo tWinfo) {
        tWinfoMapper.insertSelective(tWinfo);
    }

    /**
     * 根据水电费的序号查询该记录
     * @param wid
     * @return
     */
    @Override
    public TWinfo findPriceById(Integer wid) {
        return tWinfoMapper.selectByPrimaryKey(wid);
    }

    /**
     * 修改价格
     * @param tWinfo
     */
    @Override
    public void updatePrice(TWinfo tWinfo) {
        tWinfoMapper.updateByPrimaryKeySelective(tWinfo);
    }

    /**
     * 删除价格记录
     * @param id
     */
    @Override
    public void delPriceById(Integer id) {
        tWinfoMapper.deleteByPrimaryKey(id);
    }
}
