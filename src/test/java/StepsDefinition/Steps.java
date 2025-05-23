package StepsDefinition;

import Pages.ProductPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Steps extends Base {

    ProductPage productPage = new ProductPage(driver);

    @Given("I am on the Demoblaze product page")
    public void i_am_on_the_demoblaze_product_page() {
        productPage.verifyHomePageisDisplayed();
    }

    @When("I verify that the product page is displayed")
    public void i_verify_that_the_product_page_is_displayed() {
        productPage.verifyHomePageisDisplayed();

    }

    @And("I verify that the categories are displayed")
    public void i_verify_that_the_categories_are_displayed() {
        productPage.verifycategoriesisDisplayed();
    }

    @And("I click on laptops under categories (.*)$")
    public void i_click_on_laptops_under_categories_laptops(String categories) {
        productPage.clickoncategoryproductType(categories);
    }

    @And("I click on the desired product (.*$)")
    public void i_click_on_the_desired_product(String product) {
        productPage.clickonProductName(product);
    }

    @Then("I verify that the product details are displayed")
    public void i_verify_that_the_product_details_are_displayed() {
        productPage.verifyproductname();
    }

    @And("I click on the add to cart button")
    public void i_click_on_the_add_to_cart_button() {
        productPage.clickonAddToCart();
    }

    @Then("I verify the product added pop up is displayed")
    public void i_verify_the_product_added_pop_up_is_displayed() {
    }

    @Then("I click on cart to be redirected to the cart page")
    public void i_click_on_cart_to_be_redirected_to_the_cart_page() {
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
