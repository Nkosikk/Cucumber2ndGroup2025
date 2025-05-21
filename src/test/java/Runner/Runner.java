package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"StepsDefinition"},
        plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"}
        //tags = "@smoke"

)

public class Runner extends AbstractTestNGCucumberTests {
}