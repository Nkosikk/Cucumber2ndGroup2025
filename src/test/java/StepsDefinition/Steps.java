package StepsDefinition;

import io.cucumber.java.After;

import io.cucumber.java.en.*;

public class Steps extends Base {

    @After
    public void quitBrowser() {
        driver.quit();
    }

    @Given("Iam on the login page")
    public void iam_on_the_login_page() {
        loginPage.loginPageDisplayed();
    }
    @When("i enter username {}")
    public void i_enter_username(String username) {

        loginPage.enterUsername(username);
    }
    @And("I enter password {}")
    public void i_enter_password(String password) {

        loginPage.enterPassword(password);

    }
    @And("i click login button")
    public void i_click_login_button() {
        loginPage.clickLoginButton();
    }

    /**---------------Home Page Steps Definition------------------**/
    @Then("I should be on the home page")
    public void i_should_be_on_the_home_page() {
        loginPage.landingPageDisplayed();
    }

    @Given("I am logged in with valid credentials")
    public void i_am_logged_in_with_valid_credentials() {

            loginPage.loginPageDisplayed();
            loginPage.enterUsername("standard_user");
            loginPage.enterPassword("secret_sauce");
            loginPage.clickLoginButton();

    }
    @When("User click add to cart button")
    public void user_click_add_to_cart_button() {
        homePage.clickAddToCartButton();
    }
    @Then("User verify the cart icon has item")
    public void user_verify_the_cart_icon_has_item() {
        homePage.isItemAddedToCart();
    }

}
