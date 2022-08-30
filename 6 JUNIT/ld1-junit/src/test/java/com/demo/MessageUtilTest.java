package com.demo;

//import  org.junit.Assert;
import static org.junit.Assert.assertEquals;

import org.junit.*;

public class MessageUtilTest {
    String message = "Hello World!!";
    MessageUtil messageUtil = new MessageUtil(message);
//    executed once in the beginning
    @BeforeClass
    public static void setUp(){
        System.out.println("in before class .. logging into a database!");
    }
    @Before
    public void before(){
        System.out.println("before each test case");
    }

//    Test Case
    @Test
    public void testPrintMessage() {
//        Assert.assertEquals("Hello World!!", messageUtil.printMessage());
        assertEquals("Hello World!!", messageUtil.printMessage());
    }
    @Test
    public void testPrintMessage2() {
//        Assert.assertEquals("Hello World!!", messageUtil.printMessage());
        assertEquals("Hello World!!", messageUtil.printMessage());
    }

    @After
    public void after(){
        System.out.println("after each test case");
    }
    @AfterClass
    public static void tearDown(){
        System.out.println("in after class .. logging out of a database!");
    }
}
