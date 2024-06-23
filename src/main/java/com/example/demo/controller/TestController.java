package com.example.demo.controller;

import com.example.demo.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    private final TestService myService;

    public TestController(TestService myService) {
        this.myService = myService;
    }

    @GetMapping("/test/{input}")
    @ResponseBody
    public String getTest(@PathVariable String input) {
        return myService.getTestString(input);
    }



}
