package com.ashish.FirstBootApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ashish")
public class FirstController {

    @GetMapping("/test")
    public String test()
    {
        return "Hi Ashish Welcome to the First Spring Boot Project :) ";
    }
}
