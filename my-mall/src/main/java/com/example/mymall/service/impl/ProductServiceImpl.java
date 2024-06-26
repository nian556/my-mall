package com.example.mymall.service.impl;

import com.example.mymall.constant.ProductCategory;
import com.example.mymall.dao.ProductDao;
import com.example.mymall.dto.ProductQueryParams;
import com.example.mymall.dto.ProductResquest;
import com.example.mymall.model.Product;
import com.example.mymall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDao productDao;

    @Override
    public Integer countProduct(ProductQueryParams productQueryParams) {
        return productDao.countProduct(productQueryParams);
    }

    @Override
    public List<Product> getProducts(ProductQueryParams productQueryParams) {
        return productDao.getProducts(productQueryParams);
    }

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductResquest productResquest) {
        return productDao.createProduct(productResquest);
    }

    @Override
    public void updateProduct(Integer productId, ProductResquest productResquest) {
        productDao.updateProduct(productId,productResquest);
    }

    @Override
    public void deleteProduct(Integer productId) {
        productDao.deleteProduct(productId);
    }
}
