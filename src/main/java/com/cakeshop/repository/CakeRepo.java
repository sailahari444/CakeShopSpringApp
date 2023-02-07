package com.cakeshop.repository;

import org.springframework.data.repository.CrudRepository;

import com.cakeshop.entity.Cake;

public interface CakeRepo extends CrudRepository<Cake,Integer> {

}
