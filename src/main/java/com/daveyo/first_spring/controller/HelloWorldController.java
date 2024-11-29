package com.daveyo.first_spring.controller;

import com.daveyo.first_spring.domain.User;
import com.daveyo.first_spring.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;



    // responde um get no helloworld
    @GetMapping
        public String helloworld(){
            return helloWorldService.helloWorld("Dave");
        }

    @PostMapping("/{id}")
    public String helloPost(@PathVariable("id") String id, @RequestParam(value = "utm", defaultValue = "none")  String utm, @RequestBody User body){

        return "Hello Post, " + body.getName() +" \nID = " +id + "\n\"Fonte:\", \"" + utm+"\"";
    }




}

