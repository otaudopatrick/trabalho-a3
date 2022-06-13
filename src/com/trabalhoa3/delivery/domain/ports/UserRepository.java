package com.trabalhoa3.delivery.domain.ports;

import java.util.List;

import com.trabalhoa3.delivery.domain.entities.User;

public interface UserRepository {
    public User save(User user);

    public User findByEmail(String email);

    public List<List<String>> findAll(int page, int size);

    public List<List<String>> findAll();
}
