package com.trabalhoa3.delivery.domain.entities;

import com.trabalhoa3.delivery.domain.abstracts.UserAbstract;

public class Restaurant extends UserAbstract {
    private String description;
    private String cnpj;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + this.getName() + "'" +
                ", email='" + this.getEmail() + "'" +
                "}";
    }
}
