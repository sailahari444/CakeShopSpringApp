package com.cakeshop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int order_id;
private String name;
private String mob_no;
private String address;
private String flavour;
private double quantity;
private double price;
public Orders(String name,String mob_no,String address,String flavour,double quantity,double price){
	this.name=name;
	this.mob_no=mob_no;
	this.address=address;
	this.flavour=flavour;
	this.quantity=quantity;
	this.price=price;
}
}
