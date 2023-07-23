package com.example.geektrust.Services;
import com.example.geektrust.Entity.Position;
import com.example.geektrust.Entity.Direction;

import java.util.*;

class Game {
    int[][] grid;
    Position gman;
    Position destination;
    int minPower;

    public Game(int[][] grid, Position gman, Position destination) {
        this.grid = grid;
        this.gman = gman;
        this.destination = destination;
        this.minPower = Integer.MAX_VALUE;
    }

    public void findShortestPath() {
        PriorityQueue<Position> pq = new PriorityQueue<>((a, b) -> a.getPower() - b.getPower());
        pq.add(gman);

        while (!pq.isEmpty()) {
            Position current = pq.poll();

            if (current.getX() == destination.getX() && current.getY() == destination.getY()) {
                minPower = Math.min(minPower, current.getPower());
                continue;
            }

            // Move forward
            Position next = moveForward(current);
            if (next != null) {
                pq.add(next);
            }

            // Turn left
            next = turnLeft(current);
            if (next != null) {
                pq.add(next);
            }

            // Turn right
            next = turnRight(current);
            if (next != null) {
                pq.add(next);
            }
        }
    }

    private Position moveForward(Position current) {

        int x = current.getX();

        int y = current.getY();

        switch (current.getDirection()) {
            case "NORTH":
                x--;
                break;
            case "EAST":
                y++;
                break;
            case "SOUTH":
                x++;
                break;
            case "WEST":
                y--;
                break;
        }

        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length) {
            return null;
        }

        return new Position(x, y, current.getPower() - 10, current.getDirection());
    }

    private Position turnLeft(Position current) {
        String direction = "";

        switch (current.getDirection()) {
            case "NORTH":
                direction = "WEST";
                break;
            case "EAST":
                direction = "NORTH";
                break;
            case "SOUTH":
                direction = "EAST";
                break;
            case "WEST":
                direction = "SOUTH";
                break;
        }

        return new Position(current.getX(), current.getY(), current.getPower() - 5, direction);
    }

    private Position turnRight(Position current) {
        String direction = "";

        switch (current.getDirection()) {
            case "NORTH":
                direction = "EAST";
                break;
            case "EAST":
                direction = "SOUTH";
                break;
            case "SOUTH":
                direction = "WEST";
                break;
            case "WEST":
                direction = "NORTH";
                break;
        }

        return new Position(current.getX(), current.getY(), current.getPower() - 5, direction);
    }
}

