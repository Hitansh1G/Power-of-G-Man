package com.example.geektrust.Entity;

import static com.example.geektrust.Constants.constants.INITIALPOWER;

public class GMan {
    //current destination
    private int xCordinate ;
    private int yCordinate;
    private Direction direction;
    
    private int initialpower = INITIALPOWER;

    public int getInitialpower() {
        return initialpower;
    }

    public void setInitialpower(int initialpower) {
        this.initialpower = initialpower;
    }

    public GMan(int initialpower) {
        this.initialpower = initialpower;
    }

    public int getxCordinate() {
        return xCordinate;
    }

    public int getyCordinate() {
        return yCordinate;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setxCordinate(int xCordinate) {
        this.xCordinate = xCordinate;
    }

    public void setyCordinate(int yCordinate) {
        this.yCordinate = yCordinate;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public GMan(int xCordinate, int yCordinate, Direction direction, int initialpower) {
        this.xCordinate = xCordinate;
        this.yCordinate = yCordinate;
        this.direction = direction;
        this.initialpower = initialpower;
    }

}
