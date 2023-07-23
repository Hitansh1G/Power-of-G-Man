package com.example.geektrust.Entity;

import java.util.ArrayList;

import static com.example.geektrust.Constants.constants.xENDCORDINATE;
import static com.example.geektrust.Constants.constants.yENDCORDINATE;

public class Grid {
    //represents the game board
    private int xEndCordinate = xENDCORDINATE;

    public int getxEndCordinate() {
        return xEndCordinate;
    }

    public void setxEndCordinate(int xEndCordinate) {
        this.xEndCordinate = xEndCordinate;
    }

    public int getyEndCordinate() {
        return yEndCordinate;
    }

    public void setyEndCordinate(int yEndCordinate) {
        this.yEndCordinate = yEndCordinate;
    }

    public Grid(int xEndCordinate, int yEndCordinate) {
        this.xEndCordinate = xEndCordinate;
        this.yEndCordinate = yEndCordinate;
    }

    private int yEndCordinate = yENDCORDINATE;

}
