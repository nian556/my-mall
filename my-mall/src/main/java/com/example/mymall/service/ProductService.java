package com.example.mymall.service;

import com.example.mymall.dto.ProductResquest;
import com.example.mymall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductResquest productResquest);
}
