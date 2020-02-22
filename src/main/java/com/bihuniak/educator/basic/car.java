package com.bihuniak.educator.basic;

import javax.persistence.*;

@Entity(name = "hola")
public class car {

    @Id
    @GeneratedValue
    private long id;

    @Access(value = AccessType.PROPERTY)
//    @Basic(optional = false)
    private String brand;
//    @Column(nullable = false)
    private String model;
    private int wheels;
    @Column(name = "siema")
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

    public long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getWheels() {
        return wheels;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public boolean isSecondHand() {
        return secondHand;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model + "essa";
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void setSecondHand(boolean secondHand) {
        this.secondHand = secondHand;
    }
}