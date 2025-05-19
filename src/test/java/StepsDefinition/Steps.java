package StepsDefinition;

import io.cucumber.java.bs.A;
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

    }
    @When("The user enters the firstName (.*)$")
    public void the_user_enters_the_first_name(String firstName) {

    }


    @And("The user enters the lastName (.*)$")
    public void the_user_enters_the_last_name_test_man() {

    }
    @And("The user enters the userName (.*)$")
    public void the_user_enters_the_user_name_johntestman777_gmail_com() {

    }
    @And("the user enters the password (.*)$")
    public void the_user_enters_the_password_abc123() {

    }
    @And("The user selects the customer (.*)$")
    public void the_user_selects_the_customer_company_aaa() {

    }
    @And("The user clicks dropdown button to select a role")
    public void the_user_clicks_dropdown_button_to_select_a_role() {

    }
    @And("The user selects the role (.*)$")
    public void the_user_selects_the_role_sales_team() {

    }
    @And("The user enters the email (.*)$")
    public void the_user_enters_the_email_johntestman777_gmail_com() {

    }
    @And("The user enters the cellPhone (.*)$")
    public void the_user_enters_the_cell_phone(Integer int1) {

    }
    @And("The user clicks the save button")
    public void the_user_clicks_the_save_button() {

    }
    @Then("The user validates that the user is added to the table")
    public void the_user_validates_that_the_user_is_added_to_the_table() {

    }

}
