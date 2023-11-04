package com.thymeleaf.getchstore.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.thymeleaf.getchstore.models.Car;
import com.thymeleaf.getchstore.models.CarUser;
import com.thymeleaf.getchstore.models.User;
import com.thymeleaf.getchstore.services.CarService;
import com.thymeleaf.getchstore.services.UserService;

@Controller
public class CarUserController {
    @Autowired
    private CarService carService;

    @Autowired
    private UserService userService;

    @GetMapping("/index")
    public String home(Model model) {

        List<Car> cars = carService.getAllCars();
        List<User> users = userService.getAllUser();

        List<CarUser> carUser = new ArrayList<>();
        // Car car = new Car(1, "Toyota", "Avanza", 2020, "Black");
        // User user = new User(1, "Syawaluddin", 19, "Padangsidimpuan", "USER");

        for (Car car : cars) {
            for (User user : users) {
                if (car.getId() == user.getId()) {
                    carUser.add(new CarUser(car, user));
                }
            }
        }
        // carUser.add(new CarUser(car, user));
        model.addAttribute("carUser", carUser);
        return "index";
    }
}
