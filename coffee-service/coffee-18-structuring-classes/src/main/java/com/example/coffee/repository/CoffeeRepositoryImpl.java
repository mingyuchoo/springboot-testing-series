package com.example.coffee.repository;

import com.example.coffee.CoffeeEntity;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Application -> Controller -> Service -> Repository -> Entity
 */

@Repository
public class CoffeeRepositoryImpl implements CoffeeRepository {

    @Override
    public List<CoffeeEntity> findAll() throws IOException {
        List<CoffeeEntity> coffeeList;

        File file = new File(this.getClass().getClassLoader().getResource("data-coffee.json").getFile());
        ObjectMapper mapper = new ObjectMapper();
        coffeeList = mapper.readValue(file, new TypeReference<>() {});

        return coffeeList;
    }
}
