package com.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private static String version;

    @RequestMapping("/set")
    public void set(String version) {
        this.version = version;
    }


    @RequestMapping("/get")
    public String get() {
        return this.version;
    }

}
