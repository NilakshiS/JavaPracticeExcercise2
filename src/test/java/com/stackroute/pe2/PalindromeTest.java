package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    static Palindrome palindrome;

    @BeforeClass
    public static void setUp() {
        palindrome= new Palindrome();
    }

    @AfterClass
    public static void tearDown() {
        palindrome = null;
    }

    @Test
    public void givenPalindromeStringShouldReturnPalindrome() {
        //Arrange

        //Act
        String result = palindrome.checkForPalindrome("abcdcba");
        //Assert
        assertEquals("The string is a palindrome",result);
    }

    @Test
    public void givenEmptyStringShouldReturnError() {
        //Arrange

        //Act
        String result = palindrome.checkForPalindrome("");
        //Assert
        assertEquals("Error: Please enter a valid string!",result);
    }

    @Test
    public void givenNonPalindromeShouldReturnNotPalindrome() {
        //Arrange

        //Act
        String result = palindrome.checkForPalindrome("hello");
        //Assert
        assertEquals("The string is not a palindrome",result);
    }

    @Test
    public void givenStringShouldReturnReverseString() {
        //Arrange

        //Act
        String result = palindrome.stringReverse("hello");
        //Assert
        assertEquals("olleh",result);
    }

    @Test
    public void givenEmptyStringShouldReturnEmptyString() {
        //Arrange

        //Act
        String result = palindrome.stringReverse("");
        //Assert
        assertEquals("",result);
    }

}