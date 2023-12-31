package com.thymeleaf.getchstore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.thymeleaf.getchstore.models.Car;
import com.thymeleaf.getchstore.services.CarService;

@Controller
public class CarController {
    @Autowired
    private CarService carService;

    // @PostConstruct
    // public void initializeData() {
    // carService.initializeCars();
    // }

    @GetMapping("/list-car")
    public String listCar(Model model) {
        // List<Car> cars = new ArrayList<>();
        // cars.add(new Car(1, "Toyota", "Avanza", 2020, "Black"));
        // cars.add(new Car(2, "Honda", "Brio", 2018, "Silver"));
        // cars.add(new Car(3, "Daihatsu", "Sigra", 2013, "Red"));
        // cars.add(new Car(4, "Mitsubishi", "Xpander", 2021, "White"));

        // Car car1 = new Car(1, "Toyota", "Avanza", 2020, "Black");
        // Car car2 = new Car(2, "Honda", "Brio", 2018, "Silver");
        // Car car3 = new Car(3, "Daihatsu", "Sigra", 2013, "Red");
        // Car car4 = new Car(4, "Mitsubishi", "Xpander", 2021, "White");

        // carService.addCar(car1);
        // carService.addCar(car2);
        // carService.addCar(car3);
        // carService.addCar(car4);
        List<Car> cars = carService.getAllCars();
        model.addAttribute("cars", cars);
        return "car";
    }

    @GetMapping("/create")
    public String addCar(Model model) {
        Car car = new Car();
        model.addAttribute("car", car);
        return "add-car";
    }

    @PostMapping("/add-save")
    public String saveCar(Car car) {
        carService.addCar(car);
        return "redirect:/car";
    }
}
