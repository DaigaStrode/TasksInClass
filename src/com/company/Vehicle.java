package com.company;

public class Vehicle {
    //instance fields
    private String brand;
    private int NumberOfTires;
    private int numberOfSeats;
    private int lengthOfVehicle;
    private int currentSpeed;

    //constructors
    public Vehicle(){}
    public Vehicle(String brand, int numberOfTires, int numberOfSeats, int lengthOfVehicle, int currentSpeed) {
        this.brand = brand;
        this.NumberOfTires = numberOfTires;
        this.numberOfSeats = numberOfSeats;
        this.lengthOfVehicle =lengthOfVehicle;
        this.currentSpeed =currentSpeed;
    }

    //setters
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setNumberOfTires(int numberOfTires) {
        NumberOfTires = numberOfTires;
    }
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
    public void setLengthOfVehicle(int lengthOfVehicle) {
        this.lengthOfVehicle = lengthOfVehicle;
    }
    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    //getters
    public String getBrand() {
        return this.brand;
    }
    public int getNumberOfTires() {
        return this.NumberOfTires;
    }
    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }
    public int getLengthOfVehicle() {
        return this.lengthOfVehicle;
    }
    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    //methods
    public void startEngine() {
        System.out.println("Engine started");
    }

    public int speedUp() {
        currentSpeed = currentSpeed + 5;
        return currentSpeed;
    }

    public int slowDown() {
        currentSpeed = currentSpeed - 5;
        return currentSpeed;
    }

    public void stopEngine() {
        System.out.println("Engine stopped");
    }
}
