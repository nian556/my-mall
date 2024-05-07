package com.example.mymall.dao;

import com.example.mymall.dto.ProductResquest;
import com.example.mymall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductResquest productResquest);

    void updateProduct(Integer productId,ProductResquest productResquest);
}
