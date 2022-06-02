package com.mingyuchoo.demo;

import static org.hamcrest.Matchers.containsStringIgnoringCase;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.reactive.server.WebTestClient;

@ActiveProfiles("test") // application-test.yaml
@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class Application_WebTestClient_IntegrationTests {

    @Autowired private Environment environment;
    @Autowired private WebTestClient webTestClient;

    @Test
    void contextLoads() {
        assertTrue(true);
    }

    @Test
    public void environment() {
        assertEquals("Tom", environment.getProperty("first-name"));
        assertEquals("Hanks", environment.getProperty("last-name"));
    }

    @Test
    public void home() throws Exception {
        webTestClient
                .get().uri("/api/v1")
                .exchange()
                .expectStatus().isOk()
                .expectHeader().contentType(MediaType.APPLICATION_JSON)
                .expectBody(String.class).value(containsStringIgnoringCase("home"));
    }

    @Test
    public void hello() throws Exception {
        webTestClient
                .get().uri("api/v1/hello")
                .exchange()
                .expectStatus().isOk()
                .expectHeader().contentType(MediaType.APPLICATION_JSON)
                .expectBody(String.class).value(containsStringIgnoringCase("jack"));
    }
}
