package com.example.coffee;

import java.io.IOException;
import java.util.List;

public class CoffeeController {
    public List<CoffeeEntity> findAll() throws IOException {
        CoffeeService coffeeService  = new CoffeeService();
        return coffeeService.findAll();
    }
}
