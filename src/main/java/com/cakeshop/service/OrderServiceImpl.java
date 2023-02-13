package com.cakeshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakeshop.dao.OrdersDAO;
import com.cakeshop.entity.Orders;
@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    OrdersDAO ordersDAO;

    @Override
    public Orders insert(Orders orders) {
        
        return ordersDAO.insert(orders);
    }

    @Override
    public List<Orders> getOrders() {
        
        return ordersDAO.getOrders();
    }

    @Override
    public Orders getOrdersById(int id) {
        
        return ordersDAO.getOrdersById(id);
    }

    @Override
    public Orders update(Orders orders) {
        
        return ordersDAO.update(orders);
    }

    @Override
    public void deleteOrders(int id) {
        ordersDAO.deleteOrders(id);
        
    }
    
}
