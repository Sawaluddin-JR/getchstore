package com.thymeleaf.getchstore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.thymeleaf.getchstore.models.User;
import com.thymeleaf.getchstore.services.UserService;

import jakarta.annotation.PostConstruct;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @PostConstruct
    public void initializeData() {
        userService.initializeUsers();
    }

    @GetMapping("user")
    public String listUsers(Model model) {
        // List<User> users = new ArrayList<>();
        // users.add(new User(1, "Syawaluddin", 18, "Sidimpuan", "USERS"));
        // users.add(new User(2, "Ali Hanafiah", 19, "Banten", "ADMIN"));
        // users.add(new User(3, "Dede Adam", 20, "Banjarsari", "USERS"));

        List<User> users = userService.getAllUser();
        model.addAttribute("listUsers", users);
        return "user";
    }
}
