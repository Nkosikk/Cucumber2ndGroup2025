package StepsDefinition;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import java.util.Random;

public class Steps extends Base {

    @Given("I launch the DemoBlaze website")
    public void i_launch_the_demo_blaze_website() {
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
        // Optionally, wait for the page to load completely
        try {
            Thread.sleep(2000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @Then("I verify that I am in the product store")
    public void i_verify_that_i_am_in_the_product_store() {
        String expectedTitle = "STORE";
        String actualTitle = driver.getTitle();
        if (!actualTitle.contains(expectedTitle)) {
            throw new AssertionError("Expected title to contain '" + expectedTitle + "', but was '" + actualTitle + "'");
        }
        System.out.println("Successfully navigated to the product store.");

    }
    @When("I click on {string} under categories")
    public void i_click_on_under_categories(String string) {


    }
    @When("I select a laptop and add it to the cart")
    public void i_select_a_laptop_and_add_it_to_the_cart() {

    }
    @Then("I verify the popup message {string}")
    public void i_verify_the_popup_message(String string) {

    }
    @Then("I navigate to the cart")
    public void i_navigate_to_the_cart() {

    }
    @Then("I verify the added laptop is available")
    public void i_verify_the_added_laptop_is_available() {

    }
    @When("I place an order without filling information")
    public void i_place_an_order_without_filling_information() {

    }
    @Then("I verify the error message is displayed")
    public void i_verify_the_error_message_is_displayed() {

    }
    @When("I complete the place order form with data from Excel")
    public void i_complete_the_place_order_form_with_data_from_excel() {

    }
    @When("I click on purchase")
    public void i_click_on_purchase() {

    }
    @Then("I verify the order was successfully purchased")
    public void i_verify_the_order_was_successfully_purchased() {

    }

    @AfterStep
    public void addScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }
    }

    @After
    public void quitBrowser() {
        driver.quit();
    }
}
