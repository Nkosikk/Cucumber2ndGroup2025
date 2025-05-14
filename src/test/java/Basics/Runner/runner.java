package Basics.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"Basics/Steps"},
        plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"},
        //monochrome = true,
        tags = "@Login"
)

public class runner extends AbstractTestNGCucumberTests {
}
