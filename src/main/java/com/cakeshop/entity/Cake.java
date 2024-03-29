package com.cakeshop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Cake {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
private int cake_id;
@NonNull
@Pattern(regexp="[a-zA-Z]+",message = "Enter only string")
private String flavour;
@NonNull
private Double price;
}
