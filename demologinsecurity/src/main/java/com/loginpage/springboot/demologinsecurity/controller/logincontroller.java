package com.loginpage.springboot.demologinsecurity.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class logincontroller {

    @GetMapping("/showMyLoginPage")
    public String showMyLoginPage(){
      //  return "plain-login";
        return "fancy-login";
    }
}
