package com.trabalhoa3.delivery.domain.entities;

import com.trabalhoa3.delivery.domain.abstracts.UserAbstract;

/**
 * DeliveryMan
 */
public class DeliveryMan extends UserAbstract {

    private String typeLicense;
    private float saldo;
    private int[] socialId = new int[11];

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int[] getSocialId() {
        return socialId;
    }

    public void setSocialId(int[] socialId) {
        this.socialId = socialId;
    }

    public String getTypeLicense() {
        return this.typeLicense;
    }

    public void setTypeLicense(String typeLicense) {
        this.typeLicense = typeLicense;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + this.getName() + "'" +
                ", email='" + this.getEmail() + "'" +
                "}";
    }

}