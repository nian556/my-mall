package com.example.mymall.service;

import com.example.mymall.dto.CreateOrderRequest;
import com.example.mymall.dto.OrderQueryParams;
import com.example.mymall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);


}
