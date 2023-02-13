package com.cakeshop.service;

import java.util.List;

import com.cakeshop.entity.Orders;

public interface OrderService {
    public Orders insert(Orders orders);
    public List<Orders> getOrders();
    public Orders getOrdersById(int id);
    public Orders update(Orders orders);
    public void deleteOrders(int id);
}
