package com.demo;

//import  org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MessageUtilTest {
    String message = "Hello World!!";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
//        Assert.assertEquals("Hello World!!", messageUtil.printMessage());
        assertEquals("Hello World!!", messageUtil.printMessage());
    }
}
