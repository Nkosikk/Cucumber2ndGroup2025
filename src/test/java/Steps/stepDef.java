package Steps;



import io.cucumber.java.en.*;


public class stepDef extends Base{
//    ExcelReader excelReader = new ExcelReader();

    @Given("I should see the product store home page displayed")
    public void i_should_see_the_product_store_home_page_displayed() {
        homePage.verifyTheProductStoreIsDisplayed();
    }

    @And("I click on {string} under categories")
    public void i_click_on_under_categories(String arg0) {
        homePage.clickLaptopsCategory(arg0);
    }

    @When("I select any laptop from the list")
    public void i_select_any_laptop_from_the_list() {
        homePage.selectLaptop();
    }

    @When("I add the selected laptop to the cart")
    public void i_add_the_selected_laptop_to_the_cart() {
        cartPage.clickAddToCartButton();
    }

    @Then("I should see a popup message {string}")
    public void iShouldSeeAPopupMessage(String arg0) {
        cartPage.assertTextIsDisplayedAndAccept(arg0);
    }

    @When("I navigate to the cart")
    public void iNavigateToTheCart() {
        cartPage.navigateToCart();
    }

    @Then("I should see the laptop is displayed in the cart")
    public void i_should_see_the_laptop_is_displayed_in_the_cart() {
        cartPage.getAddedLaptopName();
    }

    @When("I click on Place Order")
    public void i_click_on_place_order() {
        cartPage.clickPlaceOrderButton();
    }

    @Then("I should see the place order form displayed")
    public void iShouldSeeThePlaceOrderFormDisplayed() {
        placeOrderPage.verifyPlaceOrderPageIsDisplayed();
    }

    @When("I click on Purchase without entering any data")
    public void i_click_on_purchase_without_entering_any_data() {
        placeOrderPage.clickPurchaseButton();
    }

    @Then("I should see an error alert displayed with the message {string}")
    public void i_should_see_an_error_alert_displayed(String arg0) {
        placeOrderPage.errorTextIsDisplayedAndPressOK(arg0);

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

