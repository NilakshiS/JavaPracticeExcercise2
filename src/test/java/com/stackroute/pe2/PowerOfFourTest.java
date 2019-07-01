package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFourTest {

    PowerOfFour powerOfFour;

    @Before
    public void setUp(){
        powerOfFour = new PowerOfFour();
    }

    @After
    public void tearDown(){
        powerOfFour = null;
    }

    @Test
    public void givenPowerOfFourShouldReturnTrue() {
        //Arrange

        //Act
        Boolean result = powerOfFour.checkIfPower(64);
        //Assert
        assertEquals(true,result);
    }

    @Test
    public void givenNonPowerOfFourShouldReturnFalse() {
        //Arrange

        //Act
        Boolean result = powerOfFour.checkIfPower(66);
        //Assert
        assertEquals(false,result);
    }

    @Test
    public void givenOneShouldReturnTrue() {
        //Arrange

        //Act
        Boolean result = powerOfFour.checkIfPower(1);
        //Assert
        assertEquals(true,result);
    }
}