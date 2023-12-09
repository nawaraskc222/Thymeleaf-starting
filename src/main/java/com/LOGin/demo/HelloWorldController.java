package com.LOGin.demo;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Nawaras kc and Nisum giri Best Friend");
        model.addAttribute("date", new Date().toLocaleString());
        
        model.addAttribute("lastName", "Kc");

         model.addAttribute("firstName", "NAwaras ");
        model.addAttribute("email", "nawaraskc888@gmail.com");
        model.addAttribute("demo", "Orange");
        return "helloworld.html";
    }
}