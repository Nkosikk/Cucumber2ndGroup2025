package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources",
        glue = {"Steps"},
        plugin = {"pretty", "html:Reports/cucumber-reports.html", "json:target/cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true,
        publish = true
//        tags="@DemoBlaze"

)

public class RunnerTest extends AbstractTestNGCucumberTests {
}
