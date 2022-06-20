package com.trabalhoa3.delivery.domain.services.client;

import com.trabalhoa3.delivery.domain.entities.Client;
import com.trabalhoa3.delivery.domain.exceptions.InvalidCredentialsException;
import com.trabalhoa3.delivery.domain.exceptions.UserNotExistsException;
import com.trabalhoa3.delivery.domain.ports.UserRepository;

public class AuthClient {
    UserRepository userRepo;

    public AuthClient(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public Client execute(String email, String password) {
        Client clientFromDB = this.userRepo.findByEmail(email);
        if (clientFromDB == null) {
            throw new UserNotExistsException("Usuário não encontrado");
        }
        if (password != clientFromDB.getPassword()) {
            throw new InvalidCredentialsException("E-email/Senha inválidos ");
        }
        return clientFromDB;
    }
}
