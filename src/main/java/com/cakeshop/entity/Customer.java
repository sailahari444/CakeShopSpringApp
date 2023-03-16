package com.cakeshop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Customer {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
private int customer_id;
@Pattern(regexp = "[A-Za-z]+")
private String name;
@Pattern(regexp="[0-9]{10}")
private String mob_no;
@Pattern(regexp="[A-Za-z0-9]+@[a-zA-Z]+/.+[a-zA-Z]+")
private String email;
private String address;
public Customer(){};
public  Customer(String name,String mob_no,String email,String address){
    this.name=name;
    this.mob_no=mob_no;
    this.email=email;
    this.address=address;
}
}
