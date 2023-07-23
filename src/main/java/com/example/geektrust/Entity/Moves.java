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
        return initialPower == moves.initialPower && changeDirection == moves.changeDirection && Objects.equals(position, moves.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(initialPower, changeDirection, position);
    }

    public void setInitialPower(int initialPower) {
        this.initialPower = initialPower;
    }

    public Moves(int initialPower, boolean changeDirection, Position position) {
        this.initialPower = initialPower;
        this.changeDirection = changeDirection;
        this.position = position;
    }

    private boolean changeDirection = false;


    Position position;
    public boolean isChangeDirection(Direction direction){
        //return true if change in direction is there
        //return false if no change in direction
        if(!direction.equals(position.getDirection())){
            return false;
        }
        return true;
    }


}
