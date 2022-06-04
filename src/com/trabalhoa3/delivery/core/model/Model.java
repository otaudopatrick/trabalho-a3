package com.trabalhoa3.delivery.core.model;

import com.trabalhoa3.delivery.database.Database;

public abstract class Model {
    private Database database;
    public Model(){
        this.database = new Database();
    }

    public Database getDatabase(){
        return this.database;
    }
}
