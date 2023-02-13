package com.cakeshop.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cakeshop.entity.Orders;
import com.cakeshop.repository.OrdersRepo;

@Repository
public class OrdersDAO {
   
    @Autowired
    OrdersRepo ordersRepo;

    public Orders insert(Orders orders) {
        
        return ordersRepo.save(orders);
    }

   
    public List<Orders> getOrders() {
        
        return ordersRepo.findAll();
    }

   
    public Orders getOrdersById(int id) {
        
        return ordersRepo.findById(id).orElse(null);
    }

   
    public Orders update(Orders orders) {
        
        return ordersRepo.save(orders);
    }

   
    public void deleteOrders(int id) {
        
        ordersRepo.deleteById(id);
    }
}
