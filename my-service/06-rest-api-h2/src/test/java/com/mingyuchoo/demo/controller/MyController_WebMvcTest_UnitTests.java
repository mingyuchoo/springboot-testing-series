package com.mingyuchoo.demo.controller;

import static org.hamcrest.Matchers.containsStringIgnoringCase;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.mingyuchoo.demo.entity.MyEntity;
import com.mingyuchoo.demo.repository.MyRepository;
import com.mingyuchoo.demo.service.MyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(MyController.class)
public class MyController_WebMvcTest_UnitTests {

    @Autowired private MockMvc mockMvc;

   
    @MockBean private MyService myService;
    @MockBean private MyRepository myRepository; // IMPORTANT

    @Test
    public void home() throws Exception {
        mockMvc.perform(get("/api/v1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().string(containsStringIgnoringCase("home")))
                .andDo(print());
    }

    @Test
    public void hello() throws Exception {
       
        when(myService.get()).thenReturn(new MyEntity("Hello", "World"));

        mockMvc.perform(get("/api/v1/hello"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().string(containsStringIgnoringCase("hello")))
                .andDo(print());
    }
}
