package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradeCalculationsTest {

    static GradeCalculations gradeCalculations;
    static int[] testInput;

    @BeforeClass
    public static void setUp() {
        gradeCalculations = new GradeCalculations();
        testInput = new int[]{86,65,98,77};
    }

    @AfterClass
    public static void tearDown() {
        gradeCalculations = null;
        testInput = null;
    }

    @Test
    public void givenIntegerArrayShouldReturnAverage() {
        //Arrange

        //Act
        double result = gradeCalculations.average(testInput);
        //Assert
        assertEquals(81.50,result,0.001);
    }

    @Test
    public void givenIntegerArrayShouldReturnMinimum() {
        //Arrange

        //Act
        int result = gradeCalculations.minimum(testInput);
        //Assert
        assertEquals(65,result);
    }

    @Test
    public void givenIntegerShouldReturnMaximum() {
        //Arrange

        //Act
        int result = gradeCalculations.maximum(testInput);
        //Assert
        assertEquals(98,result);
    }
}