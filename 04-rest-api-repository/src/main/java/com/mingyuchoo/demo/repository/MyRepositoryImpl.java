package com.mingyuchoo.demo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepositoryImpl implements MyRepository {

    @Override
    public String get() {
        return "[repository] Hello, World!";
    }
}
