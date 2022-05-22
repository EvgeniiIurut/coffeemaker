package com.aisa.coffeemaker.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class CoffeeMaker {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private boolean powerOn = false;
    private int milk;
    private int coffee;
    private int water;
}
