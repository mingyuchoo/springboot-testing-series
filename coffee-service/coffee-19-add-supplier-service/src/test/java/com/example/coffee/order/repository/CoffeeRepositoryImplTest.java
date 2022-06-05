package com.example.coffee.order.repository;

import com.example.coffee.order.repository.CoffeeRepository;
import com.example.coffee.order.repository.CoffeeRepositoryImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Application -> Controller -> Service   -> Repository -> Entity
 * (노노)          (단위테스트)    (단위테스트)   (단위테스트) -> (노노)
 * (통합테스트)     (통합테스트)    (노노)        (노노)      -> (노노)
 */

@ExtendWith(MockitoExtension.class)
class CoffeeRepositoryImplTest {

    @InjectMocks
    private CoffeeRepository coffeeRepository = new CoffeeRepositoryImpl();

    @DisplayName("`data-coffee.json` 파일이 존재하는 상황에서, 해당 파일에서 값을 읽어 들였을 때, 데이터를 읽어 들여야 한다.")
    @Test
    void testFindAll() throws Exception {

        // Given: `data-coffee.json` 파일이 존재하는 상황에서
        // When: 해당 파일에서 값을 읽어 들였을 때
        // Then: 데이터를 읽어 들여야 한다.

        Assertions.assertNotNull(coffeeRepository.findAll());
        Assertions.assertEquals(12, coffeeRepository.findAll().size());
    }
}