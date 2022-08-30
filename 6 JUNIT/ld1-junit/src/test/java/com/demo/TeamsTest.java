package com.demo;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TeamsTest {
    String session = "Junit Testing";
    String day = "Tuesday";
//    String day = null;
    Teams teams = new Teams();
    //    executed once in the beginning
    @BeforeClass
    public static void setUp(){
        System.out.println("moderator will start the meeting");
    }
    @Before
    public void before(){
        System.out.println("particiant logs in");
    }

    //    Test Case
    @Test
    public void testSession() {
//        Assert.assertEquals("Hello World!!", messageUtil.printMessage());
        assertNotNull(day);
        assertEquals("Junit Testing", teams.participantAttendSession());
        System.out.println("attend session");
    }
    @After
    public void after(){
        System.out.println("each participant will log off");
    }
    @AfterClass
    public static void tearDown(){
        System.out.println("moderator will end the meeting");
    }
}
