package StepsDef;

import io.cucumber.java.en.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ProductStoreSteps extends Base{


    @Given("I should see the product store home page displayed")
    public void i_should_see_the_product_store_home_page_displayed() {
        homeScreen.verifyTheProductStoreIsDisplayed();
    }

    @And("I click on {string} under categories")
    public void i_click_on_under_categories(String laptopCategory) {
        homeScreen.clickLaptopsCategory(laptopCategory);
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
    public void iShouldSeeAPopupMessage(String expectedMessage) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        String actualMessage = alert.getText();
        System.out.println("Popup message: " + actualMessage);

        if (!actualMessage.equals(expectedMessage)) {
            throw new AssertionError("Expected popup message: " + expectedMessage + ", but got: " + actualMessage);
        }
    }
    @And("I accept the alert")
    public void iAcceptTheAlert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }

    @When("I navigate to the cart")
    public void iNavigateToTheCart() {
        cartScreen.navigateToCart();
    }

    @Then("I should see the laptop is displayed in the cart")
    public void i_should_see_the_laptop_is_displayed_in_the_cart() {
        String laptopName = cartScreen.getAddedLaptopName();
        if (laptopName == null || laptopName.isEmpty()) {
            throw new AssertionError("No laptop is displayed in the cart.");
        }
        System.out.println("Laptop displayed in the cart: " + laptopName);
    }
    @When("I click on Place Order")
    public void i_click_on_place_order() {
        cartScreen.clickPlaceOrderButton();
    }
    @When("I click on Purchase without entering any data")
    public void i_click_on_purchase_without_entering_any_data() {
       
    }
    @Then("I should see an error alert displayed")
    public void i_should_see_an_error_alert_displayed() {
        
    }
    @When("I complete the place order form with data from Excel")
    public void i_complete_the_place_order_form_with_data_from_excel() {
        
    }
    @When("I click on Purchase")
    public void i_click_on_purchase() {
       
    }
    @Then("I should see a confirmation that the order was successfully placed")
    public void i_should_see_a_confirmation_that_the_order_was_successfully_placed() {
        
    }



}