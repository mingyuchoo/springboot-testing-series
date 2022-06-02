package com.mingyuchoo.demo.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MyRepositoryImpl_Mockito_UnitTests {

    @InjectMocks private MyRepository myRepository = new MyRepositoryImpl();

    public void get() throws Exception {
        String response = myRepository.get();
        assertThat(response).containsIgnoringCase("hello");
    }
}
