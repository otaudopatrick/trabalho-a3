package com.trabalhoa3.delivery.controller;

import com.trabalhoa3.delivery.core.controller.Controller;
import com.trabalhoa3.delivery.service.UserService;

import java.util.Map;

public class UserController extends Controller<String> {

    private UserService userService;

    public UserController(UserService service) {
        this.userService = service;
    }

    public void create(Map<String, String> entity) {
        try {
            this.userService.create(entity);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
