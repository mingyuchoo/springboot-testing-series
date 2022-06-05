package com.example.coffee.order.controller;

import com.example.coffee.order.entity.CoffeeEntity;
import com.example.coffee.order.service.CoffeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Application -> Controller -> Service   -> Repository -> Entity
 * (노노)          (단위테스트)    (단위테스트)   (단위테스트) -> (노노)
 * (통합테스트)     (통합테스트)    (노노)        (노노)      -> (노노)
 */

@WebMvcTest(CoffeeController.class)
class CoffeeControllerWebMvcTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    private CoffeeService coffeeService;

    @Test
    void findAll() throws Exception {

        // Given `원산지에 따른 로스팅된 커피 원두가 있는 상황에서`
        // When `(키오스크가 내가 만든 REST API 를 호출하여) 커피 원두 전체보기를 요청했을 때`
        // Then `커피 원두가 (JSON 형태의) 목록으로 나와야 합니다.`

        // Given
        List<CoffeeEntity> coffeeList = new ArrayList<>();
        coffeeList.add(new CoffeeEntity(1, "브라질 산토스"));

        given(coffeeService.findAll()).willReturn(coffeeList);

        // When
        mockMvc.perform(get("/coffee"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$").isArray())
                // or .andExpect(jsonPath("$[0].id").value(1))
                // or .andExpect(jsonPath("$[0].name").value("브라질 산토스"))
                .andDo(print());
    }
}