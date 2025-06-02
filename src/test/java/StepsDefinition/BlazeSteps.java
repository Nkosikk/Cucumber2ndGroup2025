package StepsDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.Alert;
import Pages.CartPage;
import Pages.ProductPage;

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
        productPage.handleAddToCartAlert();

    }


    @And("click OK button on the popup")
    public void click_ok_button_on_the_popup() {
        productPage.clickOkButtonOnPopup();
    }

    @And("I click on cart button")
    public void i_click_on_cart_button() {
        productPage.clickCartButton();

    }

    @And("verify that selected product is in the cart")
    public void verify_that_selected_product_is_in_the_cart() {
        String selectedName = productPage.getSelectedProductName();
        String cartName = cartPage.getCartProductName();
        if (!selectedName.equals(cartName)) {
            throw new AssertionError("Product in cart does not match selected product!");
        }

    }

    @And("I click on place order button")
    public void iClickOnPlaceOrderButton() {
        cartPage.clickPlaceOrderButton();
    }

    @And("I verify Place Order form is displayed")
    public void iVerifyPlaceOrderFormIsDisplayed() {
        cartPage.verifyPlaceOrderFormIsDisplayed();
    }

    @And("I click on purchase button")
    public void i_click_on_purchase_button() {
        cartPage.clickPurchaseButton();
    }

    @Then("I should see error message popup and click on OK button")
    public void i_should_see_error_message_popup_and_click_on_ok_button() {
        cartPage.clickOkButtonOnErrorPopup();
    }


    @And("I fill in name (.*)$")
    public void i_fill_in_name(String Name) {
        cartPage.enterName();

    }

    @And("I fill in country (.*)$")
    public void i_fill_in_country(String Country) {
        cartPage.enterCountry();
    }

    @And("I fill in city (.*)$")
    public void i_fill_in_city(String City) {
        cartPage.enterCity();
    }

    @And("I fill in credit card (.*)$")
    public void i_fill_in_credit_card(Integer int1) {
        cartPage.enterRandomCreditCard();
    }

    @And("I fill in month (.*)$")
    public void i_fill_in_month(String Month) {
        cartPage.enterMonth();

    }

    @And("I fill in year (.*)$")
    public void i_fill_in_year(Integer int1) {
        cartPage.enterYear();

    }

    @And("I click on purchase button again")
    public void i_click_on_purchase_button_again() {
        cartPage.clickPurchaseButtonAgain();
    }

    @Then("I should see the purchase confirmation message")
    public void i_should_see_the_purchase_confirmation_message() {
        if (!cartPage.isOrderConfirmed()) {
            throw new AssertionError("Purchase confirmation message not displayed correctly!");
        }

    }



}
