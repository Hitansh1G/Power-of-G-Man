package com.example.geektrust.Entity;

import static com.example.geektrust.Constants.constants.INITIALPOWER;

public class Position {
    //current destination
    private int x ;
    private int y;
    private int power = INITIALPOWER;
    private String direction;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Position(int x, int y, int power, String direction) {
        this.x = x;
        this.y = y;
        this.power = power;
        this.direction = direction;
    }
}
