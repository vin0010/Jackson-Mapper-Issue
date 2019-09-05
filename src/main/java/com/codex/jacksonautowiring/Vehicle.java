package com.codex.jacksonautowiring;

public abstract class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void start(){
        System.out.println("started");
    }

    public void stop(){
        System.out.println("started");
    }
}
