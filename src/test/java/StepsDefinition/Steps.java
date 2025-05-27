package StepsDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.Alert;
import StepsDefinition.Base;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Map;

public class Steps extends Base {

    @Given("I launch the Demoblaze application")
    public void i_launch_the_demoblaze_application() {
        // Already launched by Base.java
    }

    @Given("I verify I am on the product store page")
    public void i_verify_i_am_on_the_product_store_page() {
        assert homePage.isProductStoreVisible();
    }

    @When("I click on {string} category")
    public void i_click_on_category(String category) {
        homePage.clickLaptopsCategory(); // Hardcoded unless you update method
    }

    @When("I select any laptop")
    public void i_select_any_laptop() {
        homePage.clickFirstLaptop();
    }

    @When("I add the laptop to the cart")
    public void i_add_the_laptop_to_the_cart() {
        productPage.addToCart();
    }

    @When("I accept the product added alert")
    public void i_accept_the_product_added_alert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            alert.accept(); // or alert.dismiss();
        } catch (TimeoutException e) {
            System.out.println("No alert was displayed.");
            // Optionally throw if alert is mandatory
            // throw new RuntimeException("Expected alert was not present.");
        }
    }




    @When("I go to the cart")
    public void i_go_to_the_cart() {
        cartPage.goToCart();
    }

    @When("I verify the laptop is listed in the cart")
    public void i_verify_the_laptop_is_listed_in_the_cart() {
        assert cartPage.isLaptopListed();
    }

    @When("I click Place Order")
    public void i_click_place_order() {
        cartPage.clickPlaceOrder();
    }

    @When("I click Purchase without filling any information")
    public void i_click_purchase_without_filling_any_information() {
        orderPage.clickPurchase();
    }

    @Then("I should see an error message")
    public void i_should_see_an_error_message() {
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "Please fill out Name and Creditcard.");
        alert.accept();  // Close the alert
    }
    //public void i_should_see_an_error_message() {
        //assert orderPage.isErrorDisplayed();
   // }


    @When("I place the order with the following details:")
    public void i_place_the_order_with_the_following_details(DataTable dataTable) {
        Map<String, String> data = dataTable.asMaps().get(0);
        orderPage.fillForm(
                data.get("name"),
                data.get("country"),
                data.get("city"),
                data.get("card"),
                data.get("month"),
                data.get("year")
        );
    }

    @When("I click Purchase")
    public void i_click_purchase() {
        orderPage.clickPurchase();
    }

    @Then("I should see that the order was successfully purchased")
    public void i_should_see_that_the_order_was_successfully_purchased() {
        assert orderPage.isSuccessDisplayed();
    }
}
