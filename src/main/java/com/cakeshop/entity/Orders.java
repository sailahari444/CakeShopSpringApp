package com.cakeshop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
@Entity
@Data
@AllArgsConstructor
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
}
