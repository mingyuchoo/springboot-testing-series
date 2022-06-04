package com.example.coffee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

// @WebMvcTest(CoffeeController.class)
@WebMvcTest
class CoffeeControllerWebMvcTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void findAll() throws Exception {

        // Given `원산지에 따른 로스팅된 커피 원두가 있는 상황에서`
        // When `(키오스크가 내가 만든 REST API를 호출하여) 커피 원두 전체보기를 요청했을 때`
        // Then `커피 원두가 (JSON 형태의) 목록으로 나와야 합니다.`

        mockMvc.perform(get("/coffee"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$").isArray())
                // or .andExpect(jsonPath("$[0].id").value(1))
                // or .andExpect(jsonPath("$[0].name").value("브라질 산토스"))
                .andDo(print());
    }
}