package StepsDefinition;

import Pages.CartPage;
import Pages.HomePage;
import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class StepsOnlinePurchase extends Base {

//    @Given("I am on the DemoBlaze homepage")
//    public void i_am_on_the_demo_blaze_homepage() {
//        driver.get("https://www.demoblaze.com");
//        homePage = new HomePage(driver);
//    }

    @Then("I verify I am in the product store")
    public void i_verify_i_am_in_the_product_store() {
//        Assert.assertTrue(homePage.isProductStoreDisplayed());
    }

    @And("I click on laptop under categories\"")
    public void iClickOnLaptopUnderCategories() {
//        homePage.clickOnLaptop();
    }

    @And("I click any laptop name {string}")
    public void clickAnyLaptopName(String arg0) {
//        laptopsPage.selectLaptop(arg0);
    }

    @And("I add the laptop to cart")
    public void AddTheLaptopToCart() {
//        productPage.addToCartButton();
    }

    @Then("I verify popup message {string}")
    public void verify_popup_message(String message) throws InterruptedException {
//        productPage.getAlertText(message);
    }

    @And("I click OK button on popup")
    public void clickOKButtonOnPopup() {
//        productPage.clickOkButton();
    }

    @When("I click the cart")
    public void clickTheCartButton() {
//        cartPage.clickTheCartButton();
    }

//    @Then("I verify that {string} is available in the cart")
//    public void verifyLaptopInCart(String laptopName) {
//        cartPage = new CartPage(driver);
//        Assert.assertTrue(cartPage.isProductInCart(laptopName), "Laptop not found in the cart!");
//    }

    @Then("I verify that {} in cart")
    public void iVerifyThatInCart(String arg0) {
//        cartPage.verifyProductInTheCart(arg0);
    }

}


//        @Then("I click on place order")
//        public void i_click_on_place_order () {
//
//        }
//
//        @Then("I click purchase without filling details")
//        public void i_click_purchase_without_filling_details () {
//
//        }
//
//        @Then("I verify the error message displayed")
//        public void i_verify_the_error_message_displayed () {
//
//        }
//
//        @When("I enter the name {string}")
//        public void i_enter_the_name (String string){
//
//        }
////      @When("I enter the country {string}")
////    public void i_enter_the_country(String string) {
////
////      }
////    @When("I enter the city {string}")
////    public void i_enter_the_city(String string) {
////
////    }
////    @When("I enter the credit card {string}")
////    public void i_enter_the_credit_card(String string) {
////
////    }
////    @When("I enter the month {string}")
////    public void i_enter_the_month(String string) {
////
////    }
////    @When("I enter the year {string}")
////    public void i_enter_the_year(String string) {
//
////    }
//
//        @When("I click Purchase")
//        public void i_click_purchase () {
//
//        }
//
//        @Then("I verify that the order was successfully placed")
//        public void i_verify_that_the_order_was_successfully_placed () {
//
//        }



