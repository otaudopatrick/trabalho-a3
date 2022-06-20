package com.trabalhoa3.delivery.domain.entities;

import com.trabalhoa3.delivery.domain.abstracts.UserAbstract;

public class Client extends UserAbstract {
    private int[] socialId;

    public Client() {

    }

    public Client(String name, String email, String password) {
    }

    public int[] getSocialId() {
        return this.socialId;
    }

    public void setSocialId(int[] socialId) {
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
