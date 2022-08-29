package com.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJUnit {
    String message = "Hello World..";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void printMessage() {
        assertEquals("Hello World!!", messageUtil.printMessage());
    }
}
