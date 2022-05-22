package com.aisa.test.coffeemaker.controller;

import com.aisa.test.coffeemaker.domain.CoffeeMaker;
import com.aisa.test.coffeemaker.service.CoffeeMakerService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/coffeemaker")
public class NewCoffeeMakerController {

    private final CoffeeMakerService coffeeMakerService;

    public NewCoffeeMakerController(CoffeeMakerService coffeeMakerService) {
        this.coffeeMakerService = coffeeMakerService;
    }

    @PostMapping("/create")
    CoffeeMaker newCoffeeMaker() {
        return coffeeMakerService.createNewCoffeeMaker();
    }

    @GetMapping("/{id}")
    Optional<CoffeeMaker> getCoffeeMaker(@PathVariable int id) {
        return coffeeMakerService.getCoffeeMakerById(id);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    void deleteCoffeeMaker(@PathVariable int id) {
        coffeeMakerService.deleteById(id);
    }

    @PostMapping(value = "/{id}/turnon")
    void turnOnCoffeeMaker(@PathVariable int id) {
        coffeeMakerService.turnOn(id);
    }

    @PostMapping(value = "/{id}/espresso")
    void createEspresso(@PathVariable int id) throws Exception {
        coffeeMakerService.espresso(id);
    }

    @PostMapping(value = "/{id}/americano")
    void createAmericano(@PathVariable int id) throws Exception {
        coffeeMakerService.americano(id);
    }

    @PostMapping(value = "/{id}/fill")
    void fillAllResources(@PathVariable int id) {
        coffeeMakerService.fillAllResources(id);
    }



}
