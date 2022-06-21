package com.trabalhoa3.delivery.domain.services.client;

import com.trabalhoa3.delivery.domain.entities.Client;
import com.trabalhoa3.delivery.domain.exceptions.UserExistsException;
import com.trabalhoa3.delivery.domain.ports.UserRepository;

public class CreateNewClient {
    UserRepository userRepo;

    public CreateNewClient(UserRepository userRepo) {
        System.out.println("1: " + userRepo.toString());
        this.userRepo = userRepo;
    }

    public Client execute(Client client) {
        System.out.println(client.toString());
        Client clientFromDB = this.userRepo.findByEmail(client.getEmail());

        if (clientFromDB != null) {
            throw new UserExistsException("Usuário ja cadastrado");
        }
        return this.userRepo.save(client);
    }
}
