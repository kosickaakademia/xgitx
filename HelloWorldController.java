package com.in28minutes.restdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController
{
    @GetMapping( path = "/hello-world")
    public String helloWorld(){
        return "Ahoj Svet";
    }
    @GetMapping( path = "/hi-world")
    public String helloWorld(){
        return "hiiiiiiiiii worldik";
    }
}
