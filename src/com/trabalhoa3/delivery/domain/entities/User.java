package com.trabalhoa3.delivery.domain.entities;

import com.trabalhoa3.delivery.domain.abstracts.UserAbstract;

public class User extends UserAbstract {
    private String socialId;

    public User() {

    }

    public User(String name, String email, String password) {
    }

    public String getSocialId() {
        return this.socialId;
    }

    public void setSocialId(String socialId) {
        this.socialId = socialId;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + this.getName() + "'" +
                ", email='" + this.getEmail() + "'" +
                "}";
    }

}
