package com.aisa.test.coffeemaker.domain;

import lombok.Data;

@Data
public class CoffeeMaker {
    private int id;
    private boolean powerOn = false;
    private int milk;
    private int coffee;
    private int water;

}
