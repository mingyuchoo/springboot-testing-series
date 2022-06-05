package com.example.coffee.order.repository;

import com.example.coffee.order.entity.CoffeeEntity;

import java.io.IOException;
import java.util.List;

public interface CoffeeRepository {
    List<CoffeeEntity> findAll() throws IOException;
}
