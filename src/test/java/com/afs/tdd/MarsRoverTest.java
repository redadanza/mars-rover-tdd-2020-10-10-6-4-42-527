package com.afs.tdd;

import org.junit.jupiter.api.Test;

import java.rmi.UnexpectedException;

import static org.junit.jupiter.api.Assertions.*;

class MarsRoverTest {
    @Test // should_return_something_when_doingSomething_given_something
    public void should_x_0_y_1_heading_N_when_execute_given_x_0_y_0_N_and_command_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        //when
        marsRover.executeCommands("M");
        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(1,marsRover.getLocationY());
        assertEquals("N",marsRover.getHeading());
    }
    @Test
    public void should_x_0_y_0_heading_W_when_execute_given_x_0_y_0_N_and_command_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        //when
        marsRover.executeCommands("L");
        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("W",marsRover.getHeading());
    }
    @Test
    public void should_x_0_y_0_heading_E_when_execute_given_x_0_y_0_N_and_command_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        //when
        marsRover.executeCommands("R");
        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("E",marsRover.getHeading());
    }
    @Test
    public void should_x_0_y_n1_heading_S_when_execute_given_x_0_y_0_S_and_command_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"S");
        //when
        marsRover.executeCommands("M");
        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(-1,marsRover.getLocationY());
        assertEquals("S",marsRover.getHeading());
    }
    @Test
    public void should_x_0_y_0_heading_E_when_execute_given_x_0_y_0_S_and_command_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"S");
        //when
        marsRover.executeCommands("L");
        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("E",marsRover.getHeading());
    }
    @Test
    public void should_x_0_y_0_heading_W_when_execute_given_x_0_y_0_S_and_command_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"S");
        //when
        marsRover.executeCommands("R");
        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("W",marsRover.getHeading());
    }
    @Test
    public void should_x_1_y_0_heading_E_when_execute_given_x_0_y_0_E_and_command_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"E");
        //when
        marsRover.executeCommands("M");
        //then
        assertEquals(1,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("E",marsRover.getHeading());
    }
    @Test
    public void should_x_0_y_0_heading_N_when_execute_given_x_0_y_0_E_and_command_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"E");
        //when
        marsRover.executeCommands("L");
        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("N",marsRover.getHeading());
    }
    @Test
    public void should_x_0_y_0_heading_S_when_execute_given_x_0_y_0_E_and_command_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"E");
        //when
        marsRover.executeCommands("R");
        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("S",marsRover.getHeading());
    }
    @Test
    public void should_x_n1_y_0_heading_W_when_execute_given_x_0_y_0_W_and_command_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"W");
        //when
        marsRover.executeCommands("M");
        //then
        assertEquals(-1,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("W",marsRover.getHeading());
    }
    @Test
    public void should_x_0_y_0_heading_S_when_execute_given_x_0_y_0_W_and_command_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"W");
        //when
        marsRover.executeCommands("L");
        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("S",marsRover.getHeading());
    }
    @Test
    public void should_x_0_y_0_heading_N_when_execute_given_x_0_y_0_W_and_command_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"W");
        //when
        marsRover.executeCommands("R");
        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("N",marsRover.getHeading());
    }
    @Test
    public void should_x_n1_y_1_heading_N_when_execute_given_x_0_y_0_W_and_command_MLMR() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        //when
        marsRover.executeCommands("MLMR");
        //then
        assertEquals(-1,marsRover.getLocationX());
        assertEquals(1,marsRover.getLocationY());
        assertEquals("N",marsRover.getHeading());
    }

    @Test
    public void should_return_illegalArgumentException_execute_given_x_0_N_command_Q(){
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        //when
        Exception exception = assertThrows(IllegalArgumentException.class, () -> marsRover.executeCommands("Q"));
        //then
        assertEquals("CommandNotDefinedException", exception.getMessage());


    }




}
