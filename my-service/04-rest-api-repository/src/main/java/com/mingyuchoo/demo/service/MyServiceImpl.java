package com.mingyuchoo.demo.service;

import com.mingyuchoo.demo.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {

    @Autowired MyRepository myRepository;

    @Override
    public String get() {
        return myRepository.get();
    }
}
