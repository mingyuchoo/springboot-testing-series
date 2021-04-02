package com.mingyuchoo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {

    @Autowired MyRepository myRepository;

    @Override
    public MyEntity get() {
        return myRepository.get();
    }
}
