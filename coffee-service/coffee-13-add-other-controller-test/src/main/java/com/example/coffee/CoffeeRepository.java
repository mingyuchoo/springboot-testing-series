package com.example.coffee;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class CoffeeRepository {


    public List<CoffeeEntity> findAll() throws IOException {
        List<CoffeeEntity> coffeeList;

        File file = new File(this.getClass().getClassLoader().getResource("data-coffee.json").getFile());
        ObjectMapper mapper = new ObjectMapper();
        coffeeList = mapper.readValue(file, new TypeReference<>() {});

        return coffeeList;
    }
}
