package com.nero.password_validator;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestSecurity {
    private static String password="password";
    private static String moreThan8="Soccer4ever";
    private static String space="hello world";
    private static String tooShort="hey";


    private static Validator Validate0;

    @BeforeClass
    public static void init(){
        Validate0=new Validator();
    }
    @Test
    public void isPassword(){
        assertEquals(Validate0.securityCheck(password),1);
        assertEquals(Validate0.securityCheck(moreThan8),3);

    }
    @Test
    public void containSpaces(){
        assertEquals(Validate0.securityCheck(space),2);
        assertEquals(Validate0.securityCheck(moreThan8),3);
    }
    /*
    @Test
    public void isNotLongEnough(){
        assertEquals(Validate0.securityCheck(tooShort),2);
        assertEquals(Validate0.securityCheck(moreThan8),3);
    }
    */


}