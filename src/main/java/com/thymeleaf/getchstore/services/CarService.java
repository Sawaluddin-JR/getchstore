package com.thymeleaf.getchstore.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.thymeleaf.getchstore.models.Car;

@Service
public class CarService {
    private List<Car> carList = new ArrayList<>();

    public List<Car> getAllCars() {
        return carList;
    }

    public void addCar(Car car) {
        carList.add(car);
    }

    public void initializeCars() {
        // Inisialisasi data mobil saat aplikasi dimulai
        Car car1 = new Car(1, "Toyota", "Avanza", 2020, "Black");
        addCar(car1);

        Car car2 = new Car(2, "Honda", "Brio", 2018, "Silver");
        addCar(car2);
    }
}
