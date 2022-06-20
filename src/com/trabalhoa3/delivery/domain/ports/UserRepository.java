package com.trabalhoa3.delivery.domain.ports;

import java.util.List;

import com.trabalhoa3.delivery.domain.entities.Client;

public interface UserRepository {
    public Client save(Client client);

    public Client findByEmail(String email);

    public List<List<String>> findAll(int page, int size);

    public List<List<String>> findAll();
}
