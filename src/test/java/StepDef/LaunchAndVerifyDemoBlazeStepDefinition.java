package Steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAndVerifyDemoBlazeStepDefinition {
    WebDriver driver;

    @Given("I launch website")
    public void i_launch_website() {
        // code to start/launch the browse,using/sending the "child" called driver and navigate to the website
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/index.html");
        driver.manage().window().maximize();
    }


    @And("I click on the {string} link")
    public void i_click_on_the_link(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

    @Then("I verify that I am in the product store")
    public void i_verify_that_i_am_in_the_product_store() {
        // Verify the page title
        String expectedTitle = "STORE";
        String actualTitle = driver.getTitle();
        assert actualTitle.contains(expectedTitle) : "Expected title to contain: " + expectedTitle + ", but got: " + actualTitle;

        // Optionally, verify a specific element on the page
       // boolean isElementPresent = driver.findElement(By.id("nava")).isDisplayed();
        //assert isElementPresent : "Expected element with id 'nava' to be displayed, but it is not.";
    }





}
