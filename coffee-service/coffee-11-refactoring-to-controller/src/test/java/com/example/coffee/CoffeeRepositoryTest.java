package com.example.coffee;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeRepositoryTest {

    // Given: `data-coffee.json` 파일이 존재하는 상황에서
    // When: 해당 파일에서 값을 읽어 들였을 때
    // Then: 데이터를 읽어 들여야 한다.
    @DisplayName("`data-coffee.json` 파일이 존재하는 상황에서, 해당 파일에서 값을 읽어 들였을 때, 데이터를 읽어 들여야 한다.")
    @Test
    void testFindAll() throws Exception {
        CoffeeRepository coffeeRepository = new CoffeeRepository();
        Assertions.assertNotNull(coffeeRepository.findAll());
        Assertions.assertEquals(12, coffeeRepository.findAll().size());
    }
}