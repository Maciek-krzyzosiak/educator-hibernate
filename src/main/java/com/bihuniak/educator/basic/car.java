package com.bihuniak.educator.basic;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class car {

    @Id
    @GeneratedValue
    private long id;

    private String brand;
    private String model;
    private int wheels;
    private double engineCapacity;
    private boolean secondHand;

    public car(String brand, String model, int wheels, double engineCapacity, boolean secondHand) {
        this.brand = brand;
        this.model = model;
        this.wheels = wheels;
        this.engineCapacity = engineCapacity;
        this.secondHand = secondHand;
    }

    public car() {
    }

    @Override
    public String toString() {
        return "car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", wheels=" + wheels +
                ", engineCapacity=" + engineCapacity +
                ", secondHand=" + secondHand +
                '}';
    }
}