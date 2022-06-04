package com.example.coffee;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CoffeeControllerTest {

    // Given `원산지에 따른 로스팅된 커피 원두가 있는 상황에서`
    // When `(키오스크가 내가 만든 REST API를 호출하여) 커피 원두 전체보기를 요청했을 때`
    // Then `커피 원두가 (JSON 형태의) 목록으로 나와야 합니다.`

//    @DisplayName("원산지에 따른 로스팅된 커피 원두가 있는 상황에서, (키오스크가 내가 만든 REST API를 호출하여) 커피 원두 전체보기를 요청했을 때, 커피 원두가 (JSON 형태의) 목록으로 나와야 합니다.")
//    @Test
//    public void findAllShouldBeNotNull() throws IOException {
//        CoffeeController coffeeController = new CoffeeController();
//        Assertions.assertNotNull(coffeeController.findAll());
//        Assertions.assertEquals(12, coffeeController.findAll().size());
//    }

}