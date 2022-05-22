package com.aisa.test.coffeemaker.dao;

import com.aisa.test.coffeemaker.domain.CoffeeMaker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CoffeeMakerRepository extends JpaRepository<CoffeeMaker, Integer> {

}


