package StepsDefinition;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Steps extends Base {


    @Given("Verify that you are in the product store")
    public void verify_that_you_are_in_the_product_store() {
        homePage.verifyHomePageIsVisible();
    }

    @When("Click category name under categories {}")
    public void click_category_name_under_categories(String catagory) {

        homePage.clickOnTheName(catagory);
    }
    @And("Click on any item of your choice {}")
    public void click_on_any_item_of_your_choice(String laptopName) {

        homePage.clickOnTheName(laptopName);
    }
    @And("Add the selected item to cart")
    public void add_the_selected_item_to_cart() {

        productPage.addToCart();
    }
    @Then("Verify the message on the popup {}")
    public void verify_the_message_on_the_popup(String message) throws InterruptedException {
        productPage.confirmItemIsAdded(message);
    }
    @And("click OK button")
    public void click_ok_button() {
        productPage.clickOkButton();
    }
    @And("Click on Cart button")
    public void click_on_cart_button() {
        cartPage.clickCartMenu();
    }
    @Then("Verify the added laptop is available {}")
    public void verify_the_added_laptop_is_available(String laptopName) {
        cartPage.verifyAddedLaptopIsDisplayed(laptopName);
    }
    @When("Click button to place an order")
    public void click_button_to_place_an_order() {
        cartPage.clickPlaceOrderButton();
    }

    @And("Click Purchase without filling information")
    public void click_purchase_without_filling_information() {
        placeOrderPage.clickPurchaseButton();
    }

    @Then("Verify error message returned")
    public void verify_error_message_returned() throws InterruptedException {
        placeOrderPage.verifyPopupErrorMessage();
    }
    @When("Enter the name {}")
    public void enter_the_name(String name) {
        placeOrderPage.enterName(name);
    }
    @And("Enter the country {}")
    public void enter_the_country(String country) {
        placeOrderPage.enterCountry(country);
    }
    @And("Enter the city {}")
    public void enter_the_city(String city) {
        placeOrderPage.enterCity(city);
    }
    @And("Enter credit card {}")
    public void enter_credit_card(String int1) {
        placeOrderPage.enterCreditCard(int1);
    }
    @And("Enter month {}")
    public void enter_month(String int1) {
        placeOrderPage.enterMonth(int1);
    }
    @And("Enter year {}")
    public void enter_year(String int1) {
        placeOrderPage.enterYear(int1);

    }
    @And("Click purchase button")
    public void click_purchase_button() {
        placeOrderPage.clickPurchaseButton();
    }
    @Then("Verify that the order was successfully purchased")
    public void verify_that_the_order_was_successfully_purchased() throws InterruptedException {
        placeOrderPage.verifyOrderWasSuccessfullyPurchased();
    }

    @AfterStep
    public void addScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }
    }

    @After
    public void closeBrowser(){
        driver.close();
    }

}