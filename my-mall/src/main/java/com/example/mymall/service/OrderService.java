package com.example.mymall.service;

import com.example.mymall.dto.CreateOrderRequest;
import com.example.mymall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);


}
