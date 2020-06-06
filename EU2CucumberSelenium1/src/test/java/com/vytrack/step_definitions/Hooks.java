package com.vytrack.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("\tthis is coming from BEFORE\n");
    }

    @After
    public void tearDown(){
        System.out.println("\tthis is coming from AFTER\n");
    }
}
