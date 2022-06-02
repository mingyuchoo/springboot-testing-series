package com.mingyuchoo.demo.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import com.mingyuchoo.demo.entity.MyEntity;
import com.mingyuchoo.demo.repository.MyRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MyServiceImpl_Mockito_UnitTests {

    @Mock private MyRepository myRepository;

    @InjectMocks private MyService myService = new MyServiceImpl();

    @Test
    public void get() throws Exception {
        when(myRepository.get()).thenReturn(new MyEntity("Hello", "World"));

        MyEntity myEntity = myService.get();
        assertThat(myEntity.getFirstName()).isEqualTo("Hello");
        assertThat(myEntity.getLastName()).isEqualTo("World");
    }
}
