package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.Assert.*;

public class FileUpperCaseTest {
    FileUpperCase fileUpperCase;

    @Before
    public void setUp(){
        fileUpperCase =  new FileUpperCase();
    }

    @After
    public void tearDown(){
        fileUpperCase = null;
    }

    @Test
    public void givenCorrectFileShouldReturnUpperCaseContents() {
        //Arrange

        //Act
        String result = fileUpperCase.convertUpperCase(new File("/home/nilakshi/PracticeExcercise2/src/test/resources/testinput.txt"));
        //Assert
        assertEquals("HELLO WORLD\nTHIS IS A FILE 26",result);
    }


    @Test
    public void givenIncorrectFileShouldReturnError() {
        //Arrange

        //Act
        String result = fileUpperCase.convertUpperCase(new File("testinput.txt"));
        //Assert
        assertEquals("testinput.txt (No such file or directory)",result);
    }


}