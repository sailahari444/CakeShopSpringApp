package com.cakeshop.service;

import java.util.List;

import com.cakeshop.entity.Cake;

public interface CakeService {
public Cake insertCake(Cake c);
public Cake getCake(int id);
public void delCake(int id);
public Cake editCake(Cake c);
public List<Cake> getCake();
}
