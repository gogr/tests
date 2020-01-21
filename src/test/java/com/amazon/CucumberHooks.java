package com.amazon;

import com.WebDriverFactory;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks {
    @Before
    public void beforeTest(Scenario scenario) {
        System.out.println("Running " + scenario.getName());
    }

    @After
    public void afterTest(Scenario scenario) {
        System.out.println(scenario.getName() + " execution is completed");
        WebDriverFactory.getDriver().quit();
        WebDriverFactory.setDriver(null);
    }
}
