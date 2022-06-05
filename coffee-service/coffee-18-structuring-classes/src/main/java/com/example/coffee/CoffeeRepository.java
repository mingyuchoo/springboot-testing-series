package com.example.coffee;

import java.io.IOException;
import java.util.List;

public interface CoffeeRepository {
    List<CoffeeEntity> findAll() throws IOException;
}
