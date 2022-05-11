package com.sparta.oop.homeworks.vehicles;

import com.sparta.oop.homeworks.vehicles.enums.CarClassification;
import com.sparta.oop.homeworks.vehicles.enums.EngineType;
import com.sparta.oop.homeworks.vehicles.enums.TransportType;

public class Car extends Vehicle implements VehicleWithEngine {

    private final String make;
    private final String model;
    private EngineType engineType;
    private double engineSize;
    private CarClassification carClass;
    private String licensePlate;

    //region Constructors

    public Car(String make, String model, String color) {
        super("Car", color, TransportType.LAND);
        this.make = make;
        this.model = model;
    }

    public Car(String make, String model, String color, EngineType engineType, double engineSize, CarClassification carClass) {
        this(make, model, color);
        this.engineType = engineType;
        this.engineSize = engineSize;
        this.carClass = carClass;
    }

    //endregion

    //region Getters and Setters

    public String getMake() { return make; }

    public String getModel() { return model; }

    public EngineType getEngineType() { return engineType; }
    public void setEngineType(EngineType engineType) { this.engineType = engineType; }

    public double getEngineSize() { return engineSize; }
    public void setEngineSize(double engineSize) { this.engineSize = engineSize; }

    public CarClassification getCarClass() { return carClass; }

    public String getLicensePlate() { return licensePlate; }
    public void setLicensePlate(String licensePlate) { this.licensePlate = licensePlate; }

    //endregion

    @Override
    public void engineOnOff() {
        engineOn = !engineOn;
    }

    @Override
    public void startEngine() {
        if (!engineOn) {
            engineOnOff();
            System.out.println("Engine has started");
        } else {
            System.out.println("Engine already running");
        }
    }

    @Override
    public void stopEngine() {
        if (engineOn) {
            engineOnOff();
            System.out.println("Engine turned off");
        } else {
            System.out.println("Engine already off");
        }
    }
}
