package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Features/blaze_assessment.feature",
        glue = {"StepsDefinition.BlazeSteps"},
        plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"},
        //monochrome = true,
        tags = "@Assessment"
)

public class RunnerTest extends AbstractTestNGCucumberTests {
}
