package com.example.mymall.dao.impl;

import com.example.mymall.constant.ProductCategory;
import com.example.mymall.dao.ProductDao;
import com.example.mymall.dto.ProductResquest;
import com.example.mymall.model.Product;
import com.example.mymall.rowmapper.ProductRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    @Override
    public Product getProductById(Integer productId) {
        String sql = "select product_id,product_name, category, image_url, price, stock, description, created_date, last_modified_date from product where product_id = :productId";

        Map<String, Object> map = new HashMap<>();
        map.put("productId",productId);

        List<Product> productList = namedParameterJdbcTemplate.query(sql,map,new ProductRowMapper());

        if (productList.size()>0){
            return productList.get(0);
        }else {
            return null;
        }
    }

    @Override
    public Integer createProduct(ProductResquest productResquest) {
        String sql = "INSERT INTO product (product_name, category, image_url, price, stock, description, created_date, " +
                "last_modified_date) VALUES (:productName,:category,:imageUrl,:price,:stock,:description,:createdDate," +
                ":lastModifiedDate);";

        Map<String,Object> map = new HashMap<>();
        map.put("productName",productResquest.getProductName());

        map.put("category",productResquest.getCategory().toString());

        map.put("imageUrl",productResquest.getImageUrl());
        map.put("price",productResquest.getPrice());
        map.put("stock",productResquest.getStock());
        map.put("description",productResquest.getDescription());

        Date now = new Date();
        map.put("createdDate",now);
        map.put("lastModifiedDate",now);

        KeyHolder keyHolder = new GeneratedKeyHolder();

        namedParameterJdbcTemplate.update(sql,new MapSqlParameterSource(map),keyHolder);
        int productId = keyHolder.getKey().intValue();
        return productId;
    }
}
