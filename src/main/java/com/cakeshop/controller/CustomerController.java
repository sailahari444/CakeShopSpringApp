package com.cakeshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cakeshop.entity.Customer;
import com.cakeshop.service.CustomerService;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping("/customer/insert")
	public Customer CustomerInsert(@RequestParam String name,@RequestParam String mob_no,String email,String address) {
		Customer c=new Customer(name,mob_no,email,address);
		return customerService.insertCustomer(c);
	}
	@PostMapping("/customer/update")
	public Customer CustomerUpdate(@RequestParam(name = "Customer_id") int id,@RequestParam String name,@RequestParam String mob_no,String email,String adress) {
		Customer Customer=new Customer(id,name,mob_no,email,adress);
		return customerService.editCustomer(Customer);
	}
	@PostMapping("/customer/getCustomerById")
	public Customer getCustomerById(@RequestParam int id) {
		return customerService.getCustomer(id);
	}
	@PostMapping("/customer/getCustomer")
	public List<Customer> getCustomer(){
		return customerService.getCustomer();
	}
	@PostMapping("/customer/deleteCustomer")
	public void deleteCustomer(int id) {
		customerService.delCustomer(id);
	}
    
}
