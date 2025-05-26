package StepsDefinition;


import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



public class Steps extends Base {

    @Given("I am in the product store")
    public void i_am_in_the_product_store() {
        homePage.verifyProductStoreIsDisplayed();

    }

    @When("I select a laptop from the product list")
    public void i_select_a_laptop_from_the_product_list() {
        homePage.clickLaptopsButton();
    }

    @And("I select a laptop of my choice the laptop list")
    public void iSelectALaptopOfMyChoiceTheLaptopList() {
        homePage.clickSonyVaioI5();
    }

    @And("I add the laptop to the cart")
    public void iAddTheLaptopToTheCart() {
        homePage.clickAddToCart();
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



