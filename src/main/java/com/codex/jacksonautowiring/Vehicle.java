package com.codex.jacksonautowiring;

public abstract class Vehicle {
    private String vehicleName;

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public void start(){
        System.out.println("started");
    }

    public void stop(){
        System.out.println("started");
    }
}
