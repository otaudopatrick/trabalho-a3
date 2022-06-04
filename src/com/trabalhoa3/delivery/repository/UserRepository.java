package com.trabalhoa3.delivery.repository;

import com.trabalhoa3.delivery.core.repository.Repository;
import com.trabalhoa3.delivery.model.UserModel;

public class UserRepository extends Repository {
    UserModel model;

    public UserRepository(UserModel model){
        this.model = model;
    }

    public void create(String[] user){
        this.model.create(user);
    }
}
