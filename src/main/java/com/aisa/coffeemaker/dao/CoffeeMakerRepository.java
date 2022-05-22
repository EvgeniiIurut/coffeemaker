package com.aisa.coffeemaker.dao;

import com.aisa.coffeemaker.domain.CoffeeMaker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoffeeMakerRepository extends JpaRepository<CoffeeMaker, Integer> {

}


