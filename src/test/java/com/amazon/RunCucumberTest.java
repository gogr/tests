package com.amazon;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
        "rerun:target/rerun.txt", // Create a text file with failed scenarios
        "pretty",
        "html:target/cucumber",
        "json:target/cucumber-report.json",
        "timeline:target/cucumberTimeline"},
        strict = true
)
public class RunCucumberTest {
}
