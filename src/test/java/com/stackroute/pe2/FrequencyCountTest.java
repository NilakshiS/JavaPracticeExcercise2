package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.Map;

import static org.junit.Assert.*;

public class FrequencyCountTest {

    FrequencyCount frequencyCount = new FrequencyCount();

    @Before
    public void setUp(){
        frequencyCount  = new FrequencyCount();
    }

    @After
    public void tearDown(){
        frequencyCount = null;
    }

    @Test
    public void givenCorrectFileShouldReturnWordCount() {
        //Arrange
        Map<String,Integer> expected = Map.of("sleep",1, "a",2, "like",1, "have",1, "i",3, "man",1, "to",1, "am",1, "home",1);
        //Act
        Map actual = frequencyCount.countWords("/home/nilakshi/PracticeExcercise2/src/test/resources/frequencyCounterInput");
        //Assert
        assertEquals(expected,actual);
    }

    @Test
    public void givenIncorrectFileShouldReturnNull() {
        //Arrange
        //Act
        //Assert
        assertNull(frequencyCount.countWords("frequencyCounterInput"));
    }

}