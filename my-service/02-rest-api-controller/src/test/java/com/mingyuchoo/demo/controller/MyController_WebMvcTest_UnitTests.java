package com.mingyuchoo.demo.controller;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(MyController.class)
public class MyController_WebMvcTest_UnitTests {

    @Autowired private MockMvc mockMvc;

    @Test
    public void home() throws Exception {
        mockMvc.perform(get("/api/v1"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("home")));
    }

    @Test
    public void hello() throws Exception {
        mockMvc.perform(get("/api/v1/hello"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello")));
    }
}
