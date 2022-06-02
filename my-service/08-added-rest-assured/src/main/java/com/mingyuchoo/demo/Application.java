package com.mingyuchoo.demo;

import com.mingyuchoo.demo.entity.MyEntity;
import com.mingyuchoo.demo.repository.MyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(MyRepository repository) {
        return args -> {
            repository.save(new MyEntity("Jack", "Bauer"));
        };
    }
}
