package StepsDefinition;

import Pages.CartPage;
import Pages.HomePage;
import Pages.LaptopPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.time.Duration;
import java.util.Random;

public class Steps extends Base {

    @Given("I launch the DemoBlaze website")
    public void i_launch_the_demo_blaze_website() {
        homePage.isHomePageDisplayed();


    }

    @Then("I should see {string} on the homepage")
    public void i_should_see_on_the_homepage(String string) {
        Assert.assertTrue(homePage.isHomePageDisplayed());

    }

    @When("I click on Laptops category")
    public void i_click_on_laptops_category() {
        homePage.clickLaptopsCategory();

    }

    @And("I select a laptop of my choice")
    public void i_select_a_laptop_of_my_choice() {
        laptopPage.selectLaptop();

    }

    @And("I click on Add to Cart button")
    public void i_click_on_add_to_cart_button() {
        laptopPage.clickAddToCartButton();

    }

    @Then("I should see a popup message {string}")
    public void i_should_see_a_popup_message(String string) {
        laptopPage.verifyProductAddedMessage();
    }

    @And("I click on OK in the popup")
    public void i_click_on_ok_in_the_popup() {
        laptopPage.clickOKInPopup();

    }

    @And("I navigate to the cart")
    public void i_navigate_to_the_cart() {
        laptopPage.clickCartButton();


    }

    @Then("I should see the laptop listed")
    public void i_should_see_the_laptop_listed() {
        Assert.assertTrue(cartPage.isLaptopListed(), "Laptop is not listed in the cart.");
    }

    @When("I click on Place Order")
    public void i_click_on_place_order() {
        cartPage.clickPlaceOrder();


    }

    @And("I click Purchase without filling form")
    public void i_click_purchase_without_filling_form() {
        checkOutPage.clickPurchase();

    }

    @And("I click Ok on a popup message")
    public void i_click_ok_on_a_popup_message() {
        checkOutPage.clickOK();
    }

    @And("I fill in my name (.*)$")
    public void i_fill_in_my_name(String name) {
        checkOutPage.fillInName(name);
    }

    @And("i fill in my country (.*)$")
    public void i_fill_in_my_country(String country) {
        checkOutPage.fillInCountry(country);

    }

    @And("I fill in my city (.*)$")
    public void i_fill_in_my_city(String city) {
        checkOutPage.fillInCity(city);

    }

    @When("I fill in my credit card number {int} {int} {int} {int}")
    public void i_fill_in_my_credit_card_number(Integer int1, Integer int2, Integer int3, Integer int4) {
        checkOutPage.fillInCreditCard(Long.parseLong(int1.toString() + int2.toString() + int3.toString() + int4.toString()));
    }

    @And("I fill in my month {int}")
    public void i_fill_in_my_month(Integer int1) {
        checkOutPage.fillInMonth("0" + (new Random().nextInt(12) + 1));

    }

    @And("I fill in my year {int}")
    public void i_fill_in_my_year(Integer int1) {
        checkOutPage.fillInYear("20" + (new Random().nextInt(10) + 1));
    }

    @When("I click on Purchase")
    public void i_click_on_purchase() {
        checkOutPage.clickOnPurchase();
    }

    @Then("I should see the purchase confirmation message")
    public void i_should_see_the_purchase_confirmation_message() {
        checkOutPage.popUpMessage();
    }

    @When("I see {string} on the confirmation page")
    public void i_should_see_on_the_confirmation_page(String string) {
        checkOutPage.popUpMessage();

    }

    @And("I click OK in the confirmation popup")
    public void i_click_ok_in_the_confirmation_popup() {
        checkOutPage.clickOk();

    }


//    @After
//    public void quitBrowser() {
//        driver.quit();
//    }
}
