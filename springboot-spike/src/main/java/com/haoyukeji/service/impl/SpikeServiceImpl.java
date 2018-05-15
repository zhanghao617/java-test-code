package com.haoyukeji.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.haoyukeji.entity.Product;
import com.haoyukeji.entity.ProductExample;
import com.haoyukeji.mapper.ProductMapper;
import com.haoyukeji.service.SpikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpikeServiceImpl implements SpikeService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public PageInfo<Product> findProductByPageNo(Integer pageNo) {
        PageHelper.startPage(pageNo,10);
        return new PageInfo<>(productMapper.selectByExample(new ProductExample()));
    }

    @Override
    public void saveNewProduct(Product product) {
        productMapper.insertSelective(product);
    }

    @Override
    public Product findProById(Integer id) {
        return productMapper.selectByPrimaryKey(id);
    }
}
