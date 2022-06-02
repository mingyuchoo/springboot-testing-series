package com.mingyuchoo.demo;

import static org.hamcrest.Matchers.containsStringIgnoringCase;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

@AutoConfigureMockMvc
@ActiveProfiles("test") // application-test.yaml
@SpringBootTest
public class Application_MockMvc_IntegrationTests {

    @Autowired private Environment environment;
    @Autowired private MockMvc mockMvc;

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
        mockMvc.perform(get("/api/v1"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsStringIgnoringCase("home")));
    }

    @Test
    public void hello() throws Exception {
        mockMvc.perform(get("/api/v1/hello"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.success").value(true));
    }
}