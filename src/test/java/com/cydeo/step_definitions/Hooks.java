package com.cydeo.step_definitions;

/*
in the class we will be able to pass pre- and post- conditions to each scenario and each step.
 */

import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    //import from io.cucumber.java not from junit
    @Before(order = 0)
    public void setUpScenario(){
        System.out.println("===Setting up browser using cucumber @Before");
    }
    @Before(value = "@login", order = 1)
    public void setUpScenarioForLogin(){
        System.out.println("===this will only apply to scenario with @login tag");
    }

    @Before(value = "@db", order = 0)
    public void setupForDatabaseScenario(){
        System.out.println("===");
    }

    @After
    public void tearDownScenario(Scenario scenario){

        //scenario.isFailed()--> if scenario fails this method will return TRUE boolean value.
        if(scenario.isFailed()) {//fail=true passed=false
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        Driver.closeDriver();
//        System.out.println("===Closing browser using cucumber @After");
//        System.out.println("========Scenario ended/ Take screenshot is failed");
    }


    @BeforeStep
    public void setupSte(){
        System.out.println("---------------applying setup using @BeforeStep");

    }

    @AfterStep
    public void afterStep(){
        System.out.println("------->applying tearDown using @AfterStep");
    }
}
