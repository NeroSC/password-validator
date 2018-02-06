package com.nero.password_validator;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestSecurity {
    private static String password="password";
    private static String moreThan8="Soccer4ever";
    private static String space="hello world";
    private static String tooShort="hey";
    private static String notEnoughDigit="helloamerica";


    private static Validator Validate0;

    @BeforeClass
    public static void init(){
        Validate0=new Validator();
    }
    @Test
    public void isPassword(){
        assertEquals(2,Validate0.securityCheck(password));
    }
    @Test
    public void containSpaces(){
        assertEquals(2,Validate0.securityCheck(space));
    }

    @Test
    public void isNotLongEnough(){
        assertEquals(2,Validate0.securityCheck(tooShort));
    }
    @Test
    public void notEnoughDigit(){
        assertEquals(3,Validate0.securityCheck(notEnoughDigit));
    }
    @Test
    public void passesAllTests(){
        assertEquals(5,Validate0.securityCheck(moreThan8));
    }

}