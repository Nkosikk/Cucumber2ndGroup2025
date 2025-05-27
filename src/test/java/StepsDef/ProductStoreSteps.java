package StepsDef;

import io.cucumber.java.en.*;
import org.openqa.selenium.Alert;

public class ProductStoreSteps extends Base{

    @Given("I verify that I am in the product store")
    public void i_verify_that_i_am_in_the_product_store() {
        homeScreen.verifyTheProductStoreIsDisplayed();
    }
    @And("I click {string} under categories")
    public void i_click_under_categories() {
        homeScreen.clickLaptopsCategory();
    }
    @And("I select a laptop of my choice")
    public void i_select_a_laptop_of_my_choice() {
        homeScreen.selectLaptop();
    }
    @And("I add the laptop to the cart")
    public void i_add_the_laptop_to_the_cart() {
        cartScreen.clickAddToCartButton();
    }

    @Then("I should see a popup message {string}")
    public void i_should_see_a_popup_message(String expectedMessage) {
        Alert alert = driver.switchTo().alert();
        String actualMessage = alert.getText();
        if (!actualMessage.equals(expectedMessage)) {
            throw new AssertionError("Expected message: " + expectedMessage + ", but got: " + actualMessage);
        }
    }
    @Then("I click the {string} button on the popup")
    public void i_click_the_button_on_the_popup(String button) {
        Alert alert = driver.switchTo().alert();
        if ("OK".equalsIgnoreCase(button)) {
            alert.accept();
        } else {
            throw new IllegalArgumentException("Unsupported button: " + button);
        }
    }
    @When("I navigate to the cart")
    public void i_navigate_to_the_cart() {
        cartScreen.navigateToCart();
    }
    @Then("I verify the added laptop is available in the cart")
    public void i_verify_the_added_laptop_is_available_in_the_cart() {
        cartScreen.getAddedLaptopName();
    }
    @When("I place an order")
    public void i_place_an_order() {

    }
    @When("I click {string} without filling in the information")
    public void i_click_without_filling_in_the_information(String string) {

    }
    @Then("I verify the error message is returned")
    public void i_verify_the_error_message_is_returned() {

    }
    @When("I complete the Place Order screen with data from the Excel file")
    public void i_complete_the_place_order_screen_with_data_from_the_excel_file() {

    }
    @When("I click {string}")
    public void i_click(String string) {

    }
    @Then("I verify that the order was successfully purchased")
    public void i_verify_that_the_order_was_successfully_purchased() {

    }

    @And("I click the {string} button on the error message")
    public void iClickTheButtonOnTheErrorMessage(String arg0) {
        Alert alert = driver.switchTo().alert();
        if ("OK".equalsIgnoreCase(arg0)) {
            alert.accept();
        } else {
            throw new IllegalArgumentException("Unsupported button: " + arg0);
        }
    }
}
