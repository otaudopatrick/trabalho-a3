package com.trabalhoa3.delivery;

import com.trabalhoa3.delivery.controller.UserController;
import com.trabalhoa3.delivery.database.seed.Seeder;
import com.trabalhoa3.delivery.model.UserModel;
import com.trabalhoa3.delivery.repository.UserRepository;
import com.trabalhoa3.delivery.service.UserService;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!!");
        Map< String, String > user = new HashMap<>();
        Seeder se = new Seeder();
        user.put("name", "Patrick Luz");
        user.put("cpf", "27");

        UserModel userModel = new UserModel();
        UserRepository userRepository = new UserRepository(userModel);
        UserService userService = new UserService(userRepository);
        UserController userController = new UserController(userService);
        userController.create(user);
    }
}
