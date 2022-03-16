package com.fclass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaApisTest {
    JavaApis javaApis;

    /**
      * Before Each is run before running each method in a test
      * For each method a new Class object is created automatically by Junit 5 (this is important)
      * We want to initialize in BeforeEach so that we don't have to do it in every method
     */
    @BeforeEach
    void init(){
        javaApis = new JavaApis();
    }

    @Test
    void dayOfTheWeekSwitchTest() throws Exception {
//        JavaApis javaApis = new JavaApis(); // don't do this, this is done with method annotated with @BeforeEach which runs that method before running a test
        assertEquals("monday",javaApis.dayOftheWeekSwitchStatement(1), "first date is not monday" );
        assertEquals("weekend",javaApis.dayOftheWeekSwitchStatement(6) , "6th date is not weekend");
        assertEquals("weekend",javaApis.dayOftheWeekSwitchStatement(7) , "6th date is not weekend");
        assertThrows(Exception.class, ()->javaApis.dayOftheWeekSwitchStatement(0), "0 is not a valid date");
        assertThrows(Exception.class, ()->javaApis.dayOftheWeekSwitchStatement(8), "anything over 7 is not valid");
    }


    @Test
    void dayOfTheWeekSwitchExpressionTest(){
//        JavaApis javaApis = new JavaApis(); // don't do this, this is done with method annotated with @BeforeEach which runs that method before running a test
        assertEquals("monday", javaApis.dayOftheWeekSwitchExpression(1));
        assertEquals("tuesday", javaApis.dayOftheWeekSwitchExpression(2));
        assertEquals("thursday", javaApis.dayOftheWeekSwitchExpression(4));
        assertEquals("weekend", javaApis.dayOftheWeekSwitchExpression(6));
        assertEquals("weekend", javaApis.dayOftheWeekSwitchExpression(7));
    }

}