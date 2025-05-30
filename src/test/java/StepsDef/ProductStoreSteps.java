package StepsDef;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.ExcelReader;

public class ProductStoreSteps extends Base{
    ExcelReader excelReader = new ExcelReader();

    @Given("I should see the product store home page displayed")
    public void i_should_see_the_product_store_home_page_displayed() {
        homeScreen.verifyTheProductStoreIsDisplayed();
    }

    @And("I click on {string} under categories")
    public void i_click_on_under_categories(String arg0) {
        homeScreen.clickLaptopsCategory(arg0);
    }

    @When("I select any laptop from the list")
    public void i_select_any_laptop_from_the_list() {
        homeScreen.selectLaptop();
    }

    @When("I add the selected laptop to the cart")
    public void i_add_the_selected_laptop_to_the_cart() {
       cartScreen.clickAddToCartButton();
    }

    @Then("I should see a popup message {string}")
    public void iShouldSeeAPopupMessage(String arg0) {
        cartScreen.assertTextIsDisplayedAndAccept(arg0);
    }

    @When("I navigate to the cart")
    public void iNavigateToTheCart() {
        cartScreen.navigateToCart();
    }

    @Then("I should see the laptop is displayed in the cart")
    public void i_should_see_the_laptop_is_displayed_in_the_cart() {
        cartScreen.getAddedLaptopName();
    }

    @When("I click on Place Order")
    public void i_click_on_place_order() {
        cartScreen.clickPlaceOrderButton();
    }

    @Then("I should see the place order form displayed")
    public void iShouldSeeThePlaceOrderFormDisplayed() {
        checkoutScreen.verifyPlaceOrderPageIsDisplayed();
    }

    @When("I click on Purchase without entering any data")
    public void i_click_on_purchase_without_entering_any_data() {
        checkoutScreen.clickPurchaseButton();
    }

    @Then("I should see an error alert displayed with the message {string}")
    public void i_should_see_an_error_alert_displayed(String arg0) {
        checkoutScreen.errorTextIsDisplayedAndPressOK(arg0);

    }

    @When("I complete the place order form with data from Excel")
    public void i_complete_the_place_order_form_with_data_from_excel() {
        String name = excelReader.getCellData(1, 0);
        String country = excelReader.getCellData(1, 1);
        String city = excelReader.getCellData(1, 2);
        String card = excelReader.getCellData(1, 3);
        String month = excelReader.getCellData(1, 4);
        String year = excelReader.getCellData(1, 5);

        checkoutScreen.fillPlaceOrderForm(name, country, city, card, month, year);
    }

    @When("I click on Purchase")
    public void i_click_on_purchase() {
        checkoutScreen.clickPurchaseButton();
    }

    @Then("I should see a confirmation that the order was successfully placed")
    public void i_should_see_a_confirmation_that_the_order_was_successfully_placed() {
        checkoutScreen.getConfirmationAlertText();
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