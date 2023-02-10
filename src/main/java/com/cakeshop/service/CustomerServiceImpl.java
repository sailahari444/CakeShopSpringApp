package com.cakeshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakeshop.dao.CustomerDAO;
import com.cakeshop.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerDAO customerDAO;
    @Override
    public Customer insertCustomer(Customer c) {
        return customerDAO.customerInsert(c);
    }

    @Override
    public Customer getCustomer(int idx) {
        return customerDAO.getCustomer(idx);
    }

    @Override
    public void delCustomer(int id) {
        
        customerDAO.delCustomer(id);
    }

    @Override
    public Customer editCustomer(Customer c) {
        return customerDAO.customerUpdate(c);
    }

    @Override
    public List<Customer> getCustomer() {
        return customerDAO.getCustomer();
    }
    
}
