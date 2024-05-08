package com.example.mymall.dao;

import com.example.mymall.dto.ProductResquest;
import com.example.mymall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts();

    Product getProductById(Integer productId);

    Integer createProduct(ProductResquest productResquest);

    void updateProduct(Integer productId,ProductResquest productResquest);

    void deleteProduct(Integer productId);
}
