package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Member_VariableTest {

    Member_Variable member_variable;

    @Before
    public void setUp(){
        member_variable = new Member_Variable();
    }

    @After
    public void tearDown(){
        member_variable = null;
    }

    @Test
    public void givenValuesShouldReturnDetails() {
        //Arrange

        //Act
        String result = member_variable.Display("Harry",24,4500000);
        //Assert
        assertEquals("Member's Name: Harry\nMember's Age: 24\nMember's Salary: 4500000.0",result);
    }
}