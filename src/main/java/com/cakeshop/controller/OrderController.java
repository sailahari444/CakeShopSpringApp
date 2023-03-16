package com.cakeshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cakeshop.entity.Orders;
import com.cakeshop.service.OrderService;

import jakarta.validation.Valid;

@RestController
public class OrderController {
    @Autowired
    OrderService ordersService;
    @PostMapping("/orders/insert")
    public Orders insertOrders(@RequestBody @Valid Orders orders){
        return ordersService.insert(orders); 
    }
    @PostMapping("/orders/updateOrder")
    public Orders updatOrders(@RequestBody @Valid Orders orders){
        return ordersService.update(orders);
    }
    @PostMapping("/orders/getOrdersById")
    public Orders getOrdersById(@RequestParam int id){
        return ordersService.getOrdersById(id);
    }
    @PostMapping("/orders/getOrders")
    public List<Orders> getOrders(){
        return ordersService.getOrders();
    }
    @PostMapping("/orders/deleteOrders")
    public void deleteOrders(@RequestParam int id){
        ordersService.deleteOrders(id);
    }
    
}
