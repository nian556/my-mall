package com.example.mymall.service;

import com.example.mymall.constant.ProductCategory;
import com.example.mymall.dto.ProductQueryParams;
import com.example.mymall.dto.ProductResquest;
import com.example.mymall.model.Product;

import java.util.List;

public interface ProductService {
    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductResquest productResquest);

    void updateProduct(Integer productId,ProductResquest productResquest);

    void deleteProduct(Integer productId);
}
