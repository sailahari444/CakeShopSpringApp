package com.cakeshop.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cakeshop.entity.Cake;
import com.cakeshop.repository.CakeRepo;

@Repository
public class CakeDAO{

	@Autowired
CakeRepo cakeRepo;

public Cake cakeInsert(Cake cake) {
	return cakeRepo.save(cake);
}
	
public Cake cakeUpdate(Cake cake) {
//	List<Cake> data=new ArrayList<Cake>();
	return cakeRepo.save(cake);
}
public Cake getCake(int id) {
	return cakeRepo.findById(id).orElse(null);
}
public List<Cake> getCake() {
	return (List<Cake>) cakeRepo.findAll();
}

public void delCake(int id) {
	// TODO Auto-generated method stub
	cakeRepo.deleteById(id);
}
}
