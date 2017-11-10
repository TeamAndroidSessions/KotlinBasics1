package com.mobinius.kotlinrecyclerviewdemo.model;

/**
 * Created by prajna on 26/10/17.
 */

public class UserClass {
    private String name, address;

    public UserClass(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public UserClass(String name) {
        this.name = name;
        this.address = address;
    }

    public UserClass() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
