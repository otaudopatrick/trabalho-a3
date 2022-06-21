package com.trabalhoa3.delivery.domain.entities;

import java.time.Duration;
import java.util.InputMismatchException;

public class Plate {
    private String name;
    private float discount =0;
    private float price;
    private String description;
    private Rating rating;
    private Duration preparationTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
            this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPreparationTime(int minutes){
       try {
           this.preparationTime = Duration.ofMinutes(minutes);
       }catch (InputMismatchException e){
           System.out.println(e.getMessage());
           this.setPreparationTime(minutes);
       }
    }
    public Duration getPreparationTime(){
        return preparationTime;
    }
}
