package com.codex.jacksonautowiring;

import java.util.List;

public class TestObject {
    private List<User> users;
    private List<Vehicle> vehicle;
    private String dummyfield1;
    private String dummyfield2;


    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Vehicle> getVehicle() {
        return vehicle;
    }

    public void setVehicle(List<Vehicle> vehicle) {
        this.vehicle = vehicle;
    }

    public String getDummyfield1() {
        return dummyfield1;
    }

    public void setDummyfield1(String dummyfield1) {
        this.dummyfield1 = dummyfield1;
    }

    public String getDummyfield2() {
        return dummyfield2;
    }

    public void setDummyfield2(String dummyfield2) {
        this.dummyfield2 = dummyfield2;
    }
}
