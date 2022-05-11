package com.sparta.oop.homeworks.vehicles;

import com.sparta.oop.homeworks.vehicles.enums.TransportType;

public class Bus extends Vehicle implements VehicleWithEngine {

    private String make;
    private String model;
    private int noOfSeats;
    private String licensePlate;

    public Bus(String nameOfVehicle, String color, TransportType transportType) {
        super(nameOfVehicle, color, transportType);
    }

    public Bus(String nameOfVehicle, String color, boolean hasWheels, int noOfWheels, TransportType transportType) {
        super(nameOfVehicle, color, hasWheels, noOfWheels, transportType);
    }

    public Bus(String nameOfVehicle, String color, boolean hasEngine, TransportType transportType) {
        super(nameOfVehicle, color, hasEngine, transportType);
    }

    public Bus(String nameOfVehicle, String color, boolean hasWheels, boolean hasEngine, TransportType transportType) {
        super(nameOfVehicle, color, hasWheels, hasEngine, transportType);
    }

    @Override
    public void engineOnOff() {

    }

    @Override
    public void startEngine() {

    }

    @Override
    public void stopEngine() {

    }
}
