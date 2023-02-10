package com.cakeshop.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cakeshop.entity.Customer;
import com.cakeshop.repository.CustomerRepo;

@Repository
public class CustomerDAO {
    @Autowired
    CustomerRepo customerRepo;
    
    public Customer customerInsert(Customer cake) {
        return customerRepo.save(cake);
    }
        
    public Customer customerUpdate(Customer customer) {
    //	List<Cake> data=new ArrayList<Cake>();
        return customerRepo.save(customer);
    }
    public Customer getCustomer(int id) {
        return customerRepo.findById(id).orElse(null);
    }
    public List<Customer> getCustomer() {
        return (List<Customer>) customerRepo.findAll();
    }
    
    public void delCustomer(int id) {
        customerRepo.deleteById(id);
    }
}
