package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"StepsDefinition"},
        plugin = {"pretty", "html:Report/cucumber-reports.html", "json:target/cucumber.json"},
        //monochrome = true,
        tags = "@AddUser"
)

public class Runner extends AbstractTestNGCucumberTests {
}
