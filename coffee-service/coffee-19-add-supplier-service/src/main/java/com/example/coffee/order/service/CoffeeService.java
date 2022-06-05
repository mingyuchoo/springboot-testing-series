package com.example.coffee.order.service;

import com.example.coffee.order.entity.CoffeeEntity;

import java.io.IOException;
import java.util.List;

/**
 * Application -> Controller -> Service -> Repository -> Entity
 */

public interface CoffeeService {
    List<CoffeeEntity> findAll() throws IOException;
}
