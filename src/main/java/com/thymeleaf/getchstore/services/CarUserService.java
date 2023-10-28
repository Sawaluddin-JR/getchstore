package com.thymeleaf.getchstore.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.thymeleaf.getchstore.models.CarUser;

@Service
public class CarUserService {
    private List<CarUser> listCarUser = new ArrayList<>();

    public List<CarUser> getAllCarUser() {
        return listCarUser;
    }

    public void addCarUser(CarUser carUser) {
        listCarUser.add(carUser);
    }
}
