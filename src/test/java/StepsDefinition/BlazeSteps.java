package StepsDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.Alert;

public class BlazeSteps extends Base {


    @Given("I am on the demo blaze product page")
    public void i_am_on_the_demo_blaze_product_page() {
        driver.get("https://www.demoblaze.com/index.html");
        productPage.verifyProductPageIsDisplayed();

    }

    @And("I select a product category")
    public void i_select_a_product_category() {
        productPage.selectProductCategory();

    }

    @When("I select a product from the category")
    public void i_select_a_product_from_the_category() {
        productPage.selectProductFromCategory();


    }

    @And("I validate the product details")
    public void i_validate_the_product_details() {
        productPage.verifyProductDetails();

    }

    @And("I click on add to cart button")
    public void i_click_on_add_to_cart_button() {
        productPage.clickAddToCartButton();

    }

    @Then("I should see a popup confirming the product has been added to the cart")
    public void iShouldSeeAPopupConfirmingTheProductHasBeenAddedToTheCart() {

    }


    @And("click OK button on the popup")
    public void click_ok_button_on_the_popup() {
        // Assuming there's a method to handle the alert popup
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        if (!alertText.contains("Product added")) {
            throw new AssertionError("Expected product added confirmation, but got: " + alertText);
        }
        alert.accept(); // Click OK on the alert popup

    }

    @And("I click on cart button")
    public void i_click_on_cart_button() {
        productPage.clickCartButton();

    }

    @And("verify that selected product is in the cart")
    public void verify_that_selected_product_is_in_the_cart() {

    }
    @And("I click on purchase button")
    public void i_click_on_purchase_button() {

    }
    @Then("I should see error message to fill out the form")
    public void i_should_see_error_message_to_fill_out_the_form() {

    }
    @And("I click OK button on the error popup")
    public void i_click_ok_button_on_the_error_popup() {

    }
    @And("I fill out the form with valid details")
    public void i_fill_out_the_form_with_valid_details() {

    }
    @And("I click on purchase button again")
    public void i_click_on_purchase_button_again() {

    }
    @Then("I should see the purchase confirmation message")
    public void i_should_see_the_purchase_confirmation_message() {

    }


}
