package Runner;

import Utils.BrowserFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;

@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"StepsDefinition"},
        plugin = {"pretty", "html:Reports/cucumber-reports.html", "json:target/cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true,
        publish = true
)
public class RunnerTest extends AbstractTestNGCucumberTests {

    @BeforeClass
    public void setup() {
        BrowserFactory.initializeDriver("chrome", "https://www.demoblaze.com/");
    }
}