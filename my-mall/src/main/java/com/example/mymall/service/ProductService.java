package com.example.mymall.service;

import com.example.mymall.dto.ProductResquest;
import com.example.mymall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts();

    Product getProductById(Integer productId);

    Integer createProduct(ProductResquest productResquest);

    void updateProduct(Integer productId,ProductResquest productResquest);

    void deleteProduct(Integer productId);
}
