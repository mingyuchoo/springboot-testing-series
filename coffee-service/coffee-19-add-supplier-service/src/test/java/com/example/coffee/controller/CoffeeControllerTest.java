package com.example.coffee.controller;

import com.example.coffee.CoffeeEntity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;

/**
 * Application -> Controller -> Service   -> Repository -> Entity
 * (노노)          (단위테스트)    (단위테스트)   (단위테스트) -> (노노)
 * (통합테스트)     (통합테스트)    (노노)        (노노)      -> (노노)
 */

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CoffeeControllerTest {

    // should use 'org.springframework.boot:spring-boot-starter-webflux' dependency
    @Autowired
    private WebTestClient webTestClient;

    @DisplayName("원산지에 따른 로스팅된 커피 원두가 있는 상황에서, (키오스크가 내가 만든 REST API를 호출하여) 커피 원두 전체보기를 요청했을 때, 커피 원두가 (JSON 형태의) 목록으로 나와야 합니다.")
    @Test
    void findAllShouldBeNotNull() {

        // Given `원산지에 따른 로스팅된 커피 원두가 있는 상황에서`
        // When `(키오스크가 내가 만든 REST API를 호출하여) 커피 원두 전체보기를 요청했을 때`
        // Then `커피 원두가 (JSON 형태의) 목록으로 나와야 합니다.`

        webTestClient.get()         // HTTP Method:GET
                .uri("/coffee")     // URI: /coffee
                .exchange()
                .expectStatus().isOk()                                                // Expect: 200 OK
                .expectHeader().contentTypeCompatibleWith(MediaType.APPLICATION_JSON) // Expect: application/json;charset=UTF-8
                .expectBodyList(CoffeeEntity.class);                                  // Expect: List<CoffeeEntity>
                // or .expectBody(List.class) // Expect: List.class;
                // or .expectBody().jsonPath("$[0].id").isEqualTo(1);
    }
}