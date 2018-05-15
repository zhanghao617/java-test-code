package com.haoyukeji.service;

import com.github.pagehelper.PageInfo;
import com.haoyukeji.entity.Product;

public interface SpikeService {

    PageInfo<Product> findProductByPageNo(Integer pageNo);

    void saveNewProduct(Product product);

    Product findProById(Integer id);
}
