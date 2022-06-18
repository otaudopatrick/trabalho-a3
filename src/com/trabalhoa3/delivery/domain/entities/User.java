package com.trabalhoa3.delivery.domain.entities;

public class User {
    private String name, email, password;
    private String[] phone;
    private Adress adress;
    private Rating rating;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", email='" + getEmail() + "'" +
                "}";
    }

}
