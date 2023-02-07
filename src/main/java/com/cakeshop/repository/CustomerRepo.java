package com.cakeshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cakeshop.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {

}
