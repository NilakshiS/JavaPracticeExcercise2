package com.stackroute.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {

    @Test
    public void givenEvenNumberShouldReturnTrue() {
        //Arrange

        //Act
        boolean result = EvenNumTest.isEven(4);
        assertTrue(result);
        result = EvenNumTest.isEven(-4);
        assertTrue(result);
    }

    @Test
    public void givenOddNumberShouldReturnFalse() {
        //Arrange

        //Act
        boolean result = EvenNumTest.isEven(5);
        //Assert
        assertFalse(result);
        result = EvenNumTest.isEven(-5);
        //Assert
        assertFalse(result);
    }

}