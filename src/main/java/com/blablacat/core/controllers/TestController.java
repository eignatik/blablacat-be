package com.blablacat.core.controllers;

import com.blablacat.core.entities.TestEntity;
import com.blablacat.core.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestService service;

    @RequestMapping("/test")
    public List<TestEntity> index() {
        return service.getTestEntities();
    }

    @RequestMapping("/testHtml")
    public String showHtml() {
        return service.getHTML();
    }

    @RequestMapping(value = "/echo")
    public String echo(@RequestParam(value="request", defaultValue = "Hello!") String request) {
        return request;
    }
}
