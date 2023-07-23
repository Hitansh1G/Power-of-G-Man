package com.example.geektrust.Entity;

import java.util.Objects;

import static com.example.geektrust.Constants.constants.INITIALPOWER;

public class Moves {
    private int initialPower = INITIALPOWER;

    public int getInitialPower() {
        return initialPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moves moves = (Moves) o;
        return initialPower == moves.initialPower && changeDirection == moves.changeDirection && Objects.equals(gMan, moves.gMan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(initialPower, changeDirection, gMan);
    }

    public void setInitialPower(int initialPower) {
        this.initialPower = initialPower;
    }

    public Moves(int initialPower, boolean changeDirection, GMan gMan) {
        this.initialPower = initialPower;
        this.changeDirection = changeDirection;
        this.gMan = gMan;
    }

    private boolean changeDirection = false;


    GMan gMan ;
    public boolean isChangeDirection(Direction direction){
        //return true if change in direction is there
        //return false if no change in direction
        if(!direction.equals(gMan.getDirection())){
            return false;
        }
        return true;
    }


}
