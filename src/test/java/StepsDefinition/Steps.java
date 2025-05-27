package StepsDefinition;

import Pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.Random;

public class Steps extends Base {

    @Given("I launch the DemoBlaze website")
    public void i_launch_the_demo_blaze_website() {



    }
    @Then("I should see {string} on the homepage")
    public void i_should_see_on_the_homepage(String string) {


    }
    @When("I click on Laptops category")
    public void i_click_on_laptops_category() {

    }
    @And("I select a laptop of my choice")
    public void i_select_a_laptop_of_my_choice() {

    }
    @Then("I should see the laptop description")
    public void i_should_see_the_laptop_description() {

    }
    @When("I click on Add to Cart button")
    public void i_click_on_add_to_cart_button() {

    }
    @Then("I should see a popup message {string}")
    public void i_should_see_a_popup_message(String string) {

    }
    @When("I click on OK in the popup")
    public void i_click_on_ok_in_the_popup() {

    }
    @And("I navigate to the cart")
    public void i_navigate_to_the_cart() {

    }
    @Then("I should see the laptop listed")
    public void i_should_see_the_laptop_listed() {

    }
    @When("I click on Place Order")
    public void i_click_on_place_order() {

    }
    @And("I click Purchase without filling form")
    public void i_click_purchase_without_filling_form() {

    }
    @When("I click OK in the popup")
    public void i_click_ok_in_the_popup() {

    }
    @And("I fill in my name Sifiso Qwabe")
    public void i_fill_in_my_name_sifiso_qwabe() {

    }
    @And("i fill in my country RSA")
    public void i_fill_in_my_country_rsa() {

    }
    @And("I fill in my city New York")
    public void i_fill_in_my_city_new_york() {

    }
    @And("I fill in my credit card number {int}")
    public void i_fill_in_my_credit_card_number(Integer int1) {

    }
    @And("I fill in my month {int}")
    public void i_fill_in_my_month(Integer int1) {

    }
    @And("I fill in my year {int}")
    public void i_fill_in_my_year(Integer int1) {

    }
    @And("I click on Purchase")
    public void i_click_on_purchase() {

    }
    @When("I should see the purchase confirmation message")
    public void i_should_see_the_purchase_confirmation_message() {

    }
    @Then("I should see {string} on the confirmation page")
    public void i_should_see_on_the_confirmation_page(String string) {

    }
    @When("I click OK in the confirmation popup")
    public void i_click_ok_in_the_confirmation_popup() {

    }
    @Then("I should be redirected to the homepage")
    public void i_should_be_redirected_to_the_homepage() {

    }

    @After
    public void quitBrowser() {
        driver.quit();
    }
}
