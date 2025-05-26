package StepsDefinition;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import java.util.Random;

public class Steps extends Base {

    @Given("I am in the product store")
    public void i_am_in_the_product_store() {

    }

    @When("I select a laptop from the product list")
    public void i_select_a_laptop_from_the_product_list() {

    }


    @AfterStep
    public void addScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }
    }

    //@After
    //public void quitBrowser() {
        //driver.quit();
    //}
}

