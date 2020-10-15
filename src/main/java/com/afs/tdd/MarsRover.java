package com.afs.tdd;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
        if(command.equals("M"))
            move();
        else if(command.equals("L"))
            turnLeft();
        else if(command.equals("R"))
            turnRight();
        else
            throw new IllegalArgumentException("CommandNotDefinedException");
    }

    private void turnRight() {
        List<String> stringList = Arrays.asList("N","E","S","W");
        int index = stringList.indexOf(heading);

        heading = getHeading(index, stringList);
    }

    private void turnLeft() {
                List<String> stringList = Arrays.asList("N","W","S","E");
        int index = stringList.indexOf(heading);

        heading = getHeading(index, stringList);
    }

    private String getHeading(int index, List<String> stringList){

        String nextHead = (index == 3) ? stringList.get(0)
                        : stringList.get(index + 1);

        return stringList.stream().filter(head -> head.contains(nextHead)).collect(Collectors.joining());

    }

    private void move() {
        locationY = heading.equals("N") ? locationY + 1
                : heading.equals("S") ? locationY + -1
                : locationY + 0;

        locationX = heading.equals("E") ? locationX + 1
                : heading.equals("W") ? locationX + -1
                : locationX + 0;

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
