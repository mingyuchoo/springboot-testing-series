package com.example.coffee.repository;

import com.example.coffee.CoffeeEntity;

import java.io.IOException;
import java.util.List;

public interface CoffeeRepository {
    List<CoffeeEntity> findAll() throws IOException;
}
