package com.cakeshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cakeshop.entity.Orders;
public interface OrdersRepo extends JpaRepository<Orders, Integer> {

}