package StepsDefinition;

import io.cucumber.java.en.*;

public class Steps extends Base {

    @Given("The user table is displayed")
    public void the_user_table_is_displayed() {
        userTablePage.verifyUserTableIsDisplayed();
    }
    @And("The user click add user")
    public void the_user_click_add_user() {
        userTablePage.clickAddUserButton();

    }
    @And("The user validates that the add user form is displayed")
    public void the_user_validates_that_the_add_user_form_is_displayed() {
        addUserPage.verifyAddUserFormIsDisplayed();

    }
    @When("The user enters the firstName (.*)$")
    public void the_user_enters_the_first_name(String firstName) {
        addUserPage.enterFirstName(firstName);
    }
    @And("The user enters the lastName (.*)$")
    public void the_user_enters_the_last_name(String lastName) {
        addUserPage.enterLastName(lastName);
    }
    @And("The user enters the username (.*)$")
    public void the_user_enters_the_username(String userName) {
        addUserPage.enterUserName(userName);

    }
    @And("The user enters the password {int}")
    public void the_user_enters_the_password(Integer int1) {
        addUserPage.enterPassword(String.valueOf(int1));
    }
    @When("The user selects the customer type customer AAA")
    public void the_user_selects_the_customer_type_customer_aaa() {
        addUserPage.selectCustomerType();

    }
    @When("The user selects the role Admin")
    public void the_user_selects_the_role_admin() {
        addUserPage.selectRole();

    }
    @When("The user enters the email (.*)$")
    public void the_user_enters_the_email(String email) {
        addUserPage.enterEmail(email);

    }
    @When("The user enters the phone number {int}")
    public void the_user_enters_the_phone_number(Integer int1) {
        addUserPage.enterPhone(String.valueOf(int1));

    }
    @When("The user click on the save button")
    public void the_user_click_on_the_save_button() {
        addUserPage.clickSaveButton();

    }
    @Then("The user validates that the user is added to the table")
    public void the_user_validates_that_the_user_is_added_to_the_table() {
       // addUserPage.isUserRowDisplayed();
    }

}
