package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListFolderContentsTest {
    ListFolderContents listFolderContents;
    @Before
    public void setUp(){
        listFolderContents = new ListFolderContents();
    }

    @After
    public void tearDown(){
        listFolderContents = null;
    }

    @Test
    public void givenCorrectPathShouldReturnFolderContents() {
        //Arrange
        //Act
        String[] result = listFolderContents.getFolderContents("/home/nilakshi/PracticeExcercise2");
        //Assert
        assertArrayEquals(new String[]{"PracticeExcercise2.iml","src","out",".idea","testfile"},result);
    }

    @Test
    public void givenCorrectFileNameShouldReturnFileContents() {
        //Arrange
        //Act
        String result = new String(listFolderContents.getFileContents("/home/nilakshi/PracticeExcercise2","testfile"));
        //Assert
        assertEquals("jjj\n" + "khfskj\n" + "jdskjd\n",result);
    }

    @Test
    public void givenIncorrectPathShouldReturnNull() {
        //Arrange
        //Act
        //Assert
        assertNull(listFolderContents.getFolderContents("/home/nilakshi/jdj"));
    }

    @Test
    public void givenIncorrectFileNameShouldReturnNull() {
        //Arrange
        //Act
        //Assert
        assertNull(listFolderContents.getFileContents("/home/nilakshi/PracticeExcercise2","testkjjfile"));
    }


}