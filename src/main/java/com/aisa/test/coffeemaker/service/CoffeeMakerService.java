package com.aisa.test.coffeemaker.service;

import com.aisa.test.coffeemaker.dao.CoffeeMakerRepository;
import com.aisa.test.coffeemaker.domain.CoffeeMaker;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CoffeeMakerService {
    private final CoffeeMakerRepository coffeeMakerDAO;

    public CoffeeMakerService(CoffeeMakerRepository coffeeMakerDAO) {
        this.coffeeMakerDAO = coffeeMakerDAO;
    }

    public CoffeeMaker createNewCoffeeMaker() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.setCoffee(5);
        coffeeMaker.setWater(5);
        coffeeMaker.setMilk(5);
        coffeeMakerDAO.save(coffeeMaker);
        return coffeeMaker;
    }

    public Optional<CoffeeMaker> getCoffeeMakerById(int id) {
        return coffeeMakerDAO.findById(id);
    }

    public void deleteById(Integer id) {
        coffeeMakerDAO.deleteById(id);
    }

    public void turnOn(int id) {
        CoffeeMaker coffeeMaker = coffeeMakerDAO.getReferenceById(id);
        coffeeMaker.setPowerOn(true);
        coffeeMakerDAO.save(coffeeMaker);
    }

    public void espresso(int id) throws Exception {
        CoffeeMaker coffeeMaker = coffeeMakerDAO.getReferenceById(id);
        if ((coffeeMaker.getCoffee() < 2)||(coffeeMaker.getWater() < 1)) {
            throw new Exception("Please fill in coffee or water to create espresso");
        }
        coffeeMaker.setCoffee(coffeeMaker.getCoffee() - 2);
        coffeeMaker.setWater(coffeeMaker.getWater() - 1);
        coffeeMakerDAO.save(coffeeMaker);
    }

    public void americano(int id) throws Exception {
        CoffeeMaker coffeeMaker = coffeeMakerDAO.getReferenceById(id);
        if (!coffeeMaker.isPowerOn()) {
            throw new Exception("Please turn on the coffee maker");
        }
        if ((coffeeMaker.getCoffee() < 1)||(coffeeMaker.getWater() < 1)||(coffeeMaker.getMilk() < 1)) {
            throw new Exception("Please fill in coffee or water or milk to create americano");
        }
        coffeeMaker.setCoffee(coffeeMaker.getCoffee() - 1);
        coffeeMaker.setWater(coffeeMaker.getWater() - 1);
        coffeeMaker.setMilk(coffeeMaker.getMilk() - 1);
        coffeeMakerDAO.save(coffeeMaker);
    }

    public void fillAllResources(int id) {
        CoffeeMaker coffeeMaker = coffeeMakerDAO.getReferenceById(id);
        coffeeMaker.setCoffee(coffeeMaker.getCoffee() + 5);
        coffeeMaker.setWater(coffeeMaker.getWater() + 5);
        coffeeMaker.setMilk(coffeeMaker.getMilk() + 5);
        coffeeMakerDAO.save(coffeeMaker);
    }
}
