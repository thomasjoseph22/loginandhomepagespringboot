package com.loginpage.springboot.demologinsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Controller
public class democontroller {

    @GetMapping("/")
    public String homepage(){
        return "home";
    }

}
