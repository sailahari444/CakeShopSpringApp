package com.cakeshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cakeshop.entity.Orders;

@Repository
public interface OrdersRepo extends JpaRepository<Orders, Integer> {

}
