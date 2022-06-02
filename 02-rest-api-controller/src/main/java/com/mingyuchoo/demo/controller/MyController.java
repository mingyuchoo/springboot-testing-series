package com.mingyuchoo.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1")
public class MyController {

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public String home() {
        return "Welcome home!";
    }

    @GetMapping(value = "/hello", produces = {MediaType.APPLICATION_JSON_VALUE})
    public String hello() {
        return "[controller] Hello, World!";
    }
}
