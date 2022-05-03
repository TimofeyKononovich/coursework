package com.television.coursework.Model;

public class User {

    private int ID;

    private boolean state;

    private String location;

    public User(int ID, boolean state, String location) {
        this.ID = ID;
        this.state = state;
        this.location=location;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
