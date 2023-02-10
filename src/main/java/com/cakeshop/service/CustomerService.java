package com.cakeshop.service;

import java.util.List;

import com.cakeshop.entity.Customer;

public interface CustomerService {
    public Customer insertCustomer(Customer c);
    public Customer getCustomer(int idx);
    public void delCustomer(int id);
    public Customer editCustomer(Customer c);
    public List<Customer> getCustomer();
}
