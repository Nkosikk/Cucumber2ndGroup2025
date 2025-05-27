package StepsDefinition;

import Pages.HomePage;
import Pages.LaptopPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import java.util.Random;

public class Steps extends Base {

    @Given("I launch the DemoBlaze website")
    public void i_launch_the_demo_blaze_website() {
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/index.html");
        homePage = new HomePage(driver);


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
        laptopPage = new LaptopPage(driver);
        laptopPage.selectLaptop();

    }
    @Then("I should see the laptop description")
    public void i_should_see_the_laptop_description() {
        Assert.assertTrue(laptopPage.isLaptopPageDisplayed());

    }
    @When("I click on Add to Cart button")
    public void i_click_on_add_to_cart_button() {
        laptopPage.clickAddToCartButton();

    }
    @Then("I should see a popup message {string}")
    public void i_should_see_a_popup_message(String string) {
        String expectedMessage = "Product added";
        String actualMessage = driver.switchTo().alert().getText();
        Assert.assertTrue(actualMessage.contains(expectedMessage), "Popup message is not as expected: " + actualMessage);

    }
    @When("I click on OK in the popup")
    public void i_click_on_ok_in_the_popup() {
        driver.switchTo().alert().accept();

    }
    @And("I navigate to the cart")
    public void i_navigate_to_the_cart() {
        homePage.clickCartButton();

    }
    @Then("I should see the laptop listed")
    public void i_should_see_the_laptop_listed() {
        String expectedLaptopName = laptopPage.getLaptopName();
        String actualLaptopName = driver.findElement(By.cssSelector(".cart-item .item-name")).getText();
        Assert.assertEquals(actualLaptopName, expectedLaptopName, "Laptop name in cart does not match the selected laptop.");

    }
    @When("I click on Place Order")
    public void i_click_on_place_order() {
        driver.findElement(By.id("orderModal")).click();
//

    }
    @And("I click Purchase without filling form")
    public void i_click_purchase_without_filling_form() {
        driver.findElement(By.xpath("//button[text()='Purchase']")).click();

    }
    @When("I click OK in the popup")
    public void i_click_ok_in_the_popup() {
        String alertText = driver.switchTo().alert().getText();
        Assert.assertTrue(alertText.contains("Please fill out Name and Creditcard."), "Alert message is not as expected: " + alertText);
        driver.switchTo().alert().accept();

    }
    @And("I fill in my name Sifiso Qwabe")
    public void i_fill_in_my_name_sifiso_qwabe() {
        driver.findElement(By.id("name")).sendKeys("Sifiso Qwabe");

    }
    @And("i fill in my country RSA")
    public void i_fill_in_my_country_rsa() {
        driver.findElement(By.id("country")).sendKeys("RSA");

    }
    @And("I fill in my city New York")
    public void i_fill_in_my_city_new_york() {
        driver.findElement(By.id("city")).sendKeys("New York");

    }
    @And("I fill in my credit card number {int}")
    public void i_fill_in_my_credit_card_number(Integer int1) {
        Random random = new Random();
        int creditCardNumber = random.nextInt(90000000) + 10000000; // Generates a random 8-digit number
        driver.findElement(By.id("card")).sendKeys(String.valueOf(creditCardNumber));

    }
    @And("I fill in my month {int}")
    public void i_fill_in_my_month(Integer int1) {
        Random random = new Random();
        int month = random.nextInt(12) + 1; // Generates a random month between 1 and 12
        driver.findElement(By.id("month")).sendKeys(String.valueOf(month));

    }
    @And("I fill in my year {int}")
    public void i_fill_in_my_year(Integer int1) {
        Random random = new Random();
        int year = random.nextInt(10) + 2023; // Generates a random year between 2023 and 2032
        driver.findElement(By.id("year")).sendKeys(String.valueOf(year));

    }
    @And("I click on Purchase")
    public void i_click_on_purchase() {
        driver.findElement(By.xpath("//button[text()='Purchase']")).click();

    }
    @When("I should see the purchase confirmation message")
    public void i_should_see_the_purchase_confirmation_message() {
        String expectedMessage = "Thank you for your purchase!";
        String actualMessage = driver.switchTo().alert().getText();
        Assert.assertTrue(actualMessage.contains(expectedMessage), "Purchase confirmation message is not as expected: " + actualMessage);
        driver.switchTo().alert().accept();
    }
    @Then("I should see {string} on the confirmation page")
    public void i_should_see_on_the_confirmation_page(String string) {
        String expectedMessage = "Thank you for your purchase!";
        String actualMessage = driver.switchTo().alert().getText();
        Assert.assertTrue(actualMessage.contains(expectedMessage), "Confirmation message is not as expected: " + actualMessage);
        driver.switchTo().alert().accept();

    }
    @When("I click OK in the confirmation popup")
    public void i_click_ok_in_the_confirmation_popup() {
        driver.switchTo().alert().accept();

    }
    @Then("I should be redirected to the homepage")
    public void i_should_be_redirected_to_the_homepage() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("https://www.demoblaze.com/index.html"), "Not redirected to the homepage. Current URL: " + currentUrl);

    }

    @After
    public void quitBrowser() {
        driver.quit();
    }
}
