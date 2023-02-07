package com.cakeshop.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cakeshop.entity.Cake;
import com.cakeshop.service.CakeService;
@RestController
public class CakeController {
	@Autowired
	CakeService cakeService;
	
	@PutMapping("/cake/insert")
	public Cake cakeInsert(@RequestParam String flavour,@RequestParam double price) {
		Cake c=new Cake(flavour,price);
		return cakeService.insertCake(c);
	}
	@PostMapping("/cake/update")
	public Cake cakeUpdate(@RequestParam(name = "cake_id") int id,@RequestParam String flavour,@RequestParam double price) {
		Cake cake=new Cake(id,flavour,price);
		return cakeService.editCake(cake);
	}
	@PostMapping("/cake/getCakeById")
	public Cake getCakeById(@RequestParam int id) {
		return cakeService.getCake(id);
	}
	@PostMapping("/cake/getCake")
	public List<Cake> getCake(){
		return cakeService.getCake();
	}
	@PostMapping("/cake/deleteCake")
	public void deleteCake(int id) {
		cakeService.delCake(id);
	}
}
