package com.sparta.oop.homeworks.vehicles;

import com.sparta.oop.homeworks.vehicles.enums.TransportType;

public class Vehicle {

    private String nameOfVehicle;
    private String color;
    private boolean hasWheels = false;
    private int noOfWheels = 0;
    private boolean hasEngine = false;
    protected boolean engineOn = false;
    private TransportType transportType;

    //region Constructors

    public Vehicle(String nameOfVehicle, String color, TransportType transportType) {
        this.nameOfVehicle = nameOfVehicle;
        this.color = color;
        this.transportType = transportType;
    }

    public Vehicle(String nameOfVehicle, String color, boolean hasWheels, int noOfWheels, TransportType transportType) {
        this(nameOfVehicle, color, transportType);
        this.noOfWheels = noOfWheels;
        this.hasWheels = hasWheels;
    }

    public Vehicle(String nameOfVehicle, String color, boolean hasEngine, TransportType transportType) {
        this(nameOfVehicle, color, transportType);
        this.hasEngine = hasEngine;
    }

    public Vehicle(String nameOfVehicle, String color, boolean hasWheels, boolean hasEngine, TransportType transportType) {
        this(nameOfVehicle, color, transportType);
        this.hasWheels = hasWheels;
        this.hasEngine = hasEngine;
    }

    //endregion

    //region Getters and Setters

    public String getNameOfVehicle() { return nameOfVehicle; }
    public void setNameOfVehicle(String nameOfVehicle) { this.nameOfVehicle = nameOfVehicle; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public boolean getHasWheels() { return hasWheels; }
    public void setHasWheels(boolean hasWheels) { this.hasWheels = hasWheels; }

    public boolean getHasEngine() { return hasEngine; }
    public void setHasEngine(boolean hasEngine) { this.hasEngine = hasEngine; }

    public TransportType getTransportType() { return transportType; }
    public void setTransportType(TransportType transportType) { this.transportType = transportType; }

    //endregion

    public void accelerate() {
        if (engineOn) {
            System.out.println(nameOfVehicle + " is accelerating");
        } else {
            System.out.println(nameOfVehicle + " is not running");
        }
    }

    public void decelerate() {
        if (engineOn) {
            System.out.println( nameOfVehicle + " is decelerating");
        } else {
            System.out.println(nameOfVehicle + "is not running");
        }
    }
}
