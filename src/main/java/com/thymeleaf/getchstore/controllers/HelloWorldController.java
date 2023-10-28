package com.thymeleaf.getchstore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
// @RestController
public class HelloWorldController {
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello World");
        // model.addAttribute("message", "Hello World");
        return "helloworld";
    }
}
