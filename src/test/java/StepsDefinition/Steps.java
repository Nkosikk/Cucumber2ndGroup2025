package StepsDefinition;


import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Steps extends Base {

    //ProductPage steps
    @Given("I am on the Demoblaze product page")
    public void i_am_on_the_demoblaze_product_page() {
        productPage.verifyHomePageisDisplayed();
    }


    @And("I verify that the categories are displayed")
    public void i_verify_that_the_categories_are_displayed() {
        productPage.verifycategoriesisDisplayed();
    }

    @And("I click on laptops under categories (.*)$")
    public void i_click_on_laptops_under_categories_laptops(String categories) throws InterruptedException {
        productPage.clickoncategoryproductType(categories);
    }

    @And("I click on the desired product (.*)$")
    public void i_click_on_the_desired_product(String producttype) throws InterruptedException {
        productPage.clickonProductName(producttype);

    }

    @Then("I verify that the product details are displayed")
    public void i_verify_that_the_product_details_are_displayed() {
        productPage.verifyproductname("productName_xpath", "verifyproductname_name");
    }

    @And("I click on the add to cart button")
    public void i_click_on_the_add_to_cart_button() throws InterruptedException {
        productPage.clickonAddToCart();
    }

    @Then("I verify the product added pop up is displayed")
    public void i_verify_the_product_added_pop_up_is_displayed() {
        try {
            Alert alert = driver.switchTo().alert();
            String actualMessage = alert.getText();
            if (actualMessage.contains("Product added")) {
                System.out.println("Product added pop-up is displayed with message: " + actualMessage);
                alert.accept(); // Close the alert
            } else {
                System.out.println("Pop-up does not contain the expected message.");
            }
        } catch (NoAlertPresentException e) {
            System.out.println("No alert was present.");
        }
    }

    @Then("I click on cart to be redirected to the cart page")
    public void i_click_on_cart_to_be_redirected_to_the_cart_page() throws InterruptedException {
        productPage.clickonCart();
    }


    @When("I verify that the products cart page is displayed")
    public void i_verify_that_the_products_cart_page_is_displayed() {
        cartPage.verifyProductCartPage();

    }


    @And("I verify the total price label is displayed")
    public void i_verify_the_total_price_label_is_displayed() {
        cartPage.verifyTotalPriceLabel();

    }


    @And("I verify the correct total amount is displayed")
    public void i_verify_the_correct_total_amount_is_displayed_total() {
        cartPage.verifytotalprice();

    }

    @And("I click on the place order button")
    public void i_click_on_the_place_order_button() {
        cartPage.clickplaceorderbutton();

    }

    @And("I verify that the place order form is displayed")
    public void i_verify_that_the_place_order_form_is_displayed() {
        cartPage.setVerifyplaceorderpopup_id();

    }

    @And("I click on the purchase button without filling in the form") //without filling the form
    public void i_click_on_the_purchase_button_without_filling_in_the_form() throws InterruptedException {
        cartPage.clickPurchaseButton();
    }


    @When("The form is incomplete a warning alert popup is displayed")
    public void the_form_is_incomplete_a_warning_alert_popup_is_displayed() throws InterruptedException {
        try {
            Alert alert = driver.switchTo().alert();
            String actualMessage = alert.getText();
            if (actualMessage.contains("Please fill out Name and Creditcard.")) {
                System.out.println("Warning alert popup is displayed with message: " + actualMessage);
                alert.accept(); // Close the alert
            } else {
                System.out.println("Pop-up does not contain the expected message.");
            }
        } catch (NoAlertPresentException e) {
            System.out.println("No alert was present.");
            Thread.sleep(2000);
        }
    }

   @And("I fill in the order details with name {string}")
    public void i_fill_in_the_order_details_with_name_name(String name) {
        cartPage.enterName(name);
    }

    @And("I fill in the order details with country {string}")
    public void i_fill_in_the_order_details_with_country_country(String country) {
        cartPage.enterCountry(country);
    }

    @And("I fill in the order details with city {string}")
    public void i_fill_in_the_order_details_with_city_city(String city) {
        cartPage.enterCity(city);
    }

    @And("I fill in the order details with credit card {string}")
    public void i_fill_in_the_order_details_with_credit_card_card(String card) {
        cartPage.enterCreditCard(card);
    }

    @And("I fill in the order details with month {string}")
    public void i_fill_in_the_order_details_with_month_month(String month) {
        cartPage.enterMonth(month);
    }

    @And("I fill in the order details with year {string}")
    public void i_fill_in_the_order_details_with_year_year(String year) {
        cartPage.enterYear(year);
    }

    @And("I click on the purchase button")
    public void i_click_on_the_purchase_button() throws InterruptedException {
        cartPage.clickPurchaseButton();
    }

    @And("I verify that the purchase confirmation pop up is displayed")
    public void i_verify_that_the_purchase_confirmation_pop_up_is_displayed() {
        cartPage.verifyOrderConfirmation();
    }

    @Then("I click on the ok button to close the purchase confirmation pop up")
    public void i_click_on_the_ok_button_to_close_the_purchase_confirmation_pop_up() throws InterruptedException {
        cartPage.clickOkButton();
    }


    @AfterStep
    public void addScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }
    }

    // Method to properly quit the WebDriver
    @After
    public void quitBrowser() {
        driver.quit();
    }

}


