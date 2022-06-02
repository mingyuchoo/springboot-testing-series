package com.mingyuchoo.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test") // application-test.yaml
@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class IntegrationTests_TestRestTemplate_Application {

    @Autowired private Environment environment;
    @Autowired TestRestTemplate testRestTemplate;

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
        String result = testRestTemplate.getForObject("/api/v1", String.class);
        assertThat(result).containsIgnoringCase("home");
    }

    @Test
    public void hello() throws Exception {
        String result = testRestTemplate.getForObject("/api/v1/hello", String.class);

        assertThat(result).containsIgnoringCase("Jack");
    }
}
