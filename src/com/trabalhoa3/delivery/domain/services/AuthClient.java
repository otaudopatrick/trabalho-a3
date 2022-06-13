package com.trabalhoa3.delivery.domain.services;

import com.trabalhoa3.delivery.domain.entities.User;
import com.trabalhoa3.delivery.domain.exceptions.InvalidCredentialsException;
import com.trabalhoa3.delivery.domain.exceptions.UserNotExistsException;
import com.trabalhoa3.delivery.domain.ports.UserRepository;

public class AuthClient {
    UserRepository userRepo;

    public AuthClient(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public User execute(String email, String password) {
        User userFromDB = this.userRepo.findByEmail(email);
        if (userFromDB == null) {
            throw new UserNotExistsException("Usuário não encontrado");
        }
        if (password != userFromDB.getPassword()) {
            throw new InvalidCredentialsException("E-email/Senha inválidos ");
        }
        return userFromDB;
    }
}
