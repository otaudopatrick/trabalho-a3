package com.trabalhoa3.delivery.service;

import com.trabalhoa3.delivery.core.service.Service;
import com.trabalhoa3.delivery.repository.UserRepository;

import java.util.Map;

public class UserService extends Service {
    UserRepository userRepository;
    String[] requiredFields = { "cpf" };

    public UserService(UserRepository repository) {
        this.userRepository = repository;
    }

    public void create(Map<String, String> user) {
        // user.forEach((key,value)->{
        // boolean isExistsInRequiredFields =
        // Arrays.asList(this.requiredFields).contains(key);
        // if(!isExistsInRequiredFields){
        // throw new RuntimeException(String.format("O campo \"%s\" não é compativel com
        // essa entidade", key));
        // }
        //// System.out.println("Key: " +key);
        // System.out.println("Value: "+ key);
        // System.out.println("Contain: "+ isExistsInRequiredFields);
        // });
        String[] userFields = user.values().toArray(new String[0]);

        this.userRepository.create(userFields);
    }
}
