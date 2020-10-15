package com.afs.tdd;


import java.util.Arrays;

public class MarsRover {
    private int locationX;
    private int locationY;
    private String heading;

    public MarsRover(int locationX, int locationY, String heading) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.heading = heading;
    }

    public void executeCommands(String commands){
        Arrays.asList(commands.split("")).forEach(command -> this.executeMovement(command));
    }

    private void executeMovement(String command) {
        if(command.equals("M")) {
            move();
        }
        else if(command.equals("L")){
            turnLeft();
        }
        else if(command.equals("R")){
            turnRight();
        }
        else {
            throw new IllegalArgumentException("CommandNotDefinedException");
        }
    }

    private void turnRight() {

            heading = heading.equals("N") ? "E"
                    : heading.equals("S") ? "W"
                    : heading.equals("E") ? "S"
                    : heading.equals("N") ? "W"
                    : heading;
    }

    private void turnLeft() {
        heading = heading.equals("N") ? "W"
                : heading.equals("S") ? "E"
                : heading.equals("E") ? "N"
                : heading.equals("N") ? "S"
                : heading;
    }

    private void move() {
        if(heading.equals("N")){
            locationY += 1;
        }
        if(heading.equals("S")){
            locationY += -1;
        }
        if(heading.equals("E")){
            locationX += 1;
        }
        if(heading.equals("W")){
            locationX += -1;
        }

    }


    public int getLocationX() {
        return locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public String getHeading() {
        return heading;
    }
}
