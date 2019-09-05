package com.codex.jacksonautowiring;

public class Car extends Vehicle{
    private String carDriverName;
    private String carType;

    public String getCarDriverName() {
        return carDriverName;
    }

    public void setCarDriverName(String carDriverName) {
        this.carDriverName = carDriverName;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
}
