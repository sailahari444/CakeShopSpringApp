package com.cakeshop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Pattern;
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
@Pattern(regexp="[A-Za-z]+")
private String name;
@Pattern(regexp="[0-9]{10}")
private String mob_no;
private String address;
@Pattern(regexp="[A-Za-z]+")
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
