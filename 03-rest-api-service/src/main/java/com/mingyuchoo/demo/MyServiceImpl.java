package com.mingyuchoo.demo;

import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {

    @Override
    public String get() {
        return "[service] Hello, World!";
    }
}
