package com.codex.jacksonautowiring;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
        {
                "wealths",
                "users",
                "dummyfield1",
                "dummyfield2"
        }
)
public class TestObject {
    private List<Wealth> wealths;
    private List<User> users;
    private String dummyfield1;
    private String dummyfield2;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
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

    public List<Wealth> getWealths() {
        return wealths;
    }

    public void setWealths(List<Wealth> wealths) {
        this.wealths = wealths;
    }
}
