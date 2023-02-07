package com.cakeshop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Customer {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
private int customer_id;
private String name;
private String mob_no;
private String email;
private String address;
}
