package com.mingyuchoo.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MyServiceImpl_Mockito_UnitTests {

    @InjectMocks private MyService myService = new MyServiceImpl();

    @Test
    public void get() throws Exception {
        String response = myService.get();
        assertThat(response).containsIgnoringCase("hello");
    }
}
