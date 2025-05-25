package StepsDefinition;


import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;


public class Steps extends Base {

    //ProductPage steps
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
        Alert alert = driver.switchTo().alert();
        String actualAlertText = alert.getText();
        Assert.assertTrue(actualAlertText.contains("Product added"), "Product added pop-up is not displayed as expected.");
        alert.accept();


        String expectedMessage = "Product added";
        String actualMessage = driver.switchTo().alert().getText();
        if (actualMessage.contains(expectedMessage)) {
            System.out.println("Product added pop-up is displayed with message: " + actualMessage);
            driver.switchTo().alert().accept(); // Close the alert
        } else {
            System.out.println("Product added pop-up is not displayed or does not contain the expected message.");
        }
    }

    @Then("I click on cart to be redirected to the cart page")
    public void i_click_on_cart_to_be_redirected_to_the_cart_page() throws InterruptedException {
        productPage.clickonCart();
    }

    //CartPage steps
    @Given("I am on the Demoblaze cart page")
    public void i_am_on_the_demoblaze_cart_page() {
        cartPage.verifyProductCartPage();

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

    @And("I verify that the place order pop up is displayed")
    public void i_verify_that_the_place_order_pop_up_is_displayed() {
        cartPage.setVerifyplaceorderpopup_id();

    }

    @And("I fill in the order details with name <name>, country <country>, city <city>, credit card <credit card>, month <month>, year <year>")
    public void i_fill_in_the_order_details_with_name_name_country_country_city_city_credit_card_credit_card_month_month_year_year() {
        cartPage.entername("name");
        cartPage.entercountry("country");
        cartPage.entercity("city");
        cartPage.entercreditcard("card");
        cartPage.entermonth("month");
        cartPage.enteryear("year");
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
