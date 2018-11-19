package com.qa.test.auto.base;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BaseScenario {

    @Before
    public void initialize(){
        System.out.println("Opening the browser");
    }

    @After
    public void teardown(Scenario scenario){
        System.out.println("Scenario: "+scenario.getName()+" completed. Status: "+scenario.getStatus());
        if (scenario.isFailed()){
            System.out.println("Taking screenshot...");
        }
        System.out.println("Closing the browser");
        System.out.println("-----------------------------");
    }
}
