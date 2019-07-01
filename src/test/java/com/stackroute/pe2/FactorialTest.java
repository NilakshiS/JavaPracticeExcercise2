package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    static Factorial factorial;

    @BeforeClass
    public static void setUp() {
        factorial = new Factorial();
    }

    @AfterClass
    public static void tearDown() {
        factorial = null;
    }

    @Test
    public void intFactorialTest() {
        //Arrange

        //Act
        Integer[] result = factorial.intFactorial();
        //Assert
        assertArrayEquals(new Integer[]{1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600},result);
    }

    @Test
    public void longFactorialTest() {
        //Arrange

        //Act
        Long[] result = factorial.longFactorial();
        //Assert
        assertArrayEquals(new Long[]{1L, 2L, 6L, 24L, 120L, 720L, 5040L, 40320L, 362880L, 3628800L, 39916800L, 479001600L, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L},result);
    }
}