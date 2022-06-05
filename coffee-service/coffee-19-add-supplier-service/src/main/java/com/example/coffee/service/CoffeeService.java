package com.example.coffee.service;

import com.example.coffee.CoffeeEntity;

import java.io.IOException;
import java.util.List;

/**
 * Application -> Controller -> Service -> Repository -> Entity
 */

public interface CoffeeService {
    List<CoffeeEntity> findAll() throws IOException;
}
