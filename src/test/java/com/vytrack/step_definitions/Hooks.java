package com.vytrack.step_definitions;

import com.vytrack.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;

/*
* Hooks name is not reserved. You may name this class in anyway.
* For example: SuiteSetupandTearDown
* Hooks triggered based on tags not class name or their location
* These methods can be a part of any step definition class.
* Common practice is to store them in the separate class.

 */
public class Hooks {

    // hook before  is equals to BeforeMethod in testNG
    // Hook after is equals to AfterMethod in TestNG
    // It's not a good idea to mix implicit and explicit wait. It can lead to unexpectedly long waits
    // Usually we just use explicit and fluent waits.

    @Before
    public void setup(){
        System.out.println("*** Starting Automation ***");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    // this hook will run only before scenarios with a tag @db
    /*
    Scenario: I'm connecting to DB
     */
    @Before("@db")
    public void dbSetup(){
        System.out.println("*** Connecting to the Database ***");
    }


    @After
    public void tearDown(){
        // close brpwser, close DB connection, close tunnel
        // This is hook after
        // runs automatically after every test, regardless of result
        Driver.closeDriver();
        System.out.println("****End of test execution****");

    }

}
