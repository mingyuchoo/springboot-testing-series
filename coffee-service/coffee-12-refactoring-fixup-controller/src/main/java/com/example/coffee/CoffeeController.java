package com.example.coffee;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RequestMapping("/coffee")
@RestController
public class CoffeeController {

    @GetMapping(value = "", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<CoffeeEntity> findAll() throws IOException {
        CoffeeService coffeeService  = new CoffeeService();
        return coffeeService.findAll();
    }
}
