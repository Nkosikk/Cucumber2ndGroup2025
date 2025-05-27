package StepsDefinition;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static Utils.BrowserFactory.driver;

public class Steps {

    @Given("I launch the DemoBlaze website")
    public void i_launch_the_demo_blaze_website() {
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
        try {
            Thread.sleep(2000);
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
        driver.findElement(By.id("itemc")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Clicked on category: " + string);
    }

    @When("I select a laptop and add it to the cart")
    public void i_select_a_laptop_and_add_it_to_the_cart() {
        driver.findElement(By.linkText("Sony vaio i5")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.cssSelector(".btn.btn-success")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Selected laptop and added it to the cart.");
    }

    @Then("I verify the popup message {string}")
    public void i_verify_the_popup_message(String string) {
        String expectedMessage = string;
        String actualMessage = driver.switchTo().alert().getText();
        if (!actualMessage.equals(expectedMessage)) {
            throw new AssertionError("Expected popup message to be '" + expectedMessage + "', but was '" + actualMessage + "'");
        }
        driver.switchTo().alert().accept();
        System.out.println("Popup message verified: " + actualMessage);
    }

    @Then("I navigate to the cart")
    public void i_navigate_to_the_cart() {
        driver.findElement(By.id("cartur")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("I verify the added laptop is available")
    public void i_verify_the_added_laptop_is_available() {
        // Add logic to verify the laptop in the cart
    }

    @When("I place an order without filling information")
    public void i_place_an_order_without_filling_information() {
        driver.findElement(By.id("place-order")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.switchTo().alert().accept();
        System.out.println("Attempted to place an order without filling information.");
    }

    @Then("I verify the error message is displayed")
    public void i_verify_the_error_message_is_displayed() {
        String expectedErrorMessage = "Please fill out all fields.";
        String actualErrorMessage = driver.switchTo().alert().getText();
        if (!actualErrorMessage.equals(expectedErrorMessage)) {
            throw new AssertionError("Expected error message to be '" + expectedErrorMessage + "', but was '" + actualErrorMessage + "'");
        }
        driver.switchTo().alert().accept();
        System.out.println("Error message verified: " + actualErrorMessage);
    }

    @When("I complete the place order form with data from Excel")
    public void i_complete_the_place_order_form_with_data_from_excel() {
        String name = "John Doe";
        String country = "USA";
        String city = "New York";
        String creditCard = "1234-5678-9012-3456";
        String month = "12";
        String year = "2025";

        driver.findElement(By.id("name")).sendKeys(name);
        driver.findElement(By.id("country")).sendKeys(country);
        driver.findElement(By.id("city")).sendKeys(city);
        driver.findElement(By.id("card")).sendKeys(creditCard);
        driver.findElement(By.id("month")).sendKeys(month);
        driver.findElement(By.id("year")).sendKeys(year);

        System.out.println("Order form filled with data: " + name + ", " + country + ", " + city + ", " + creditCard + ", " + month + ", " + year);
    }

    @When("I click on purchase")
    public void i_click_on_purchase() {
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("I verify the order was successfully purchased")
    public void i_verify_the_order_was_successfully_purchased() {
        String expectedConfirmationMessage = "Thank you for your purchase!";
        // Add logic to verify the confirmation message
    }

    @AfterStep
    public void addScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }
    }

    @After
    public void quitBrowser() {
        driver.quit();
    }
}