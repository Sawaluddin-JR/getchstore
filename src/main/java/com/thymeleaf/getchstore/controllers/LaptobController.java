package com.thymeleaf.getchstore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.thymeleaf.getchstore.models.Laptob;

@Controller
public class LaptobController {
    @GetMapping("data-laptob")
    public String dataLaptob(Model model) {
        Laptob laptob = new Laptob("1", "ASUS", "ROG Zyprus G14", "20000000");
        model.addAttribute("dataLaptob", laptob);
        return "laptob";
    }

    @GetMapping("message-expression")
    public String messageExpression() {
        return "message-expression";
    }

    @GetMapping("fragment-expression")
    public String fragmentExpression() {
        return "fragment-expression";
    }
}
