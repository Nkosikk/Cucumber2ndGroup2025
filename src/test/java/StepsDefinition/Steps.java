package StepsDefinition;

import io.cucumber.java.After;
import io.cucumber.java.en.*;

import java.util.Random;

public class Steps extends Base {

    @Given("The user table is displayed")
    public void the_user_table_is_displayed() {
        userTablePage.verifyUserTableIsDisplayed();
    }

    @And("The user click add user")
    public void theUserClickAddUser() {
        userTablePage.clickAddUserButton();
    }

    @And("The user validates that the add user form is displayed")
    public void the_user_validates_that_the_add_user_form_is_displayed() {
<<<<<<< HEAD
        addUserPage.verifyAddUserFormIsDisplayed();
=======
        addUserPage.verifyAddUserPageIsDisplayed();
>>>>>>> e945785aacf87fcd64888c8f0f63130116b80f56
    }

    @And("The user enters the firstName (.*)$")
<<<<<<< HEAD
    public void the_user_enters_the_first(String firstName) {
        addUserPage.enterFirstName(firstName);
=======
    public void the_user_enters_the_first_name(String firstName) {
        addUserPage.enterFirstName(firstName);
    }

    @And("The user enters the lastName (.*)$")
    public void theUserEntersTheLastName(String lastName) {
        addUserPage.enterLastName(lastName);
    }


    @And("The user enter the userName which comes from (.*) and (.*)$")
    public void theUserEnterTheUserNameWhichComesFromLastNameAndFirstName(String firstName, String lastName) {
        Random random = new Random();
        int randomNumber = 10000 + random.nextInt(90000); // Generates a 4-digit random number

        String Username=firstName+lastName+randomNumber;
        addUserPage.enterUserName(Username);
    }

    @After
    public void quitBrowser() {
        driver.quit();
>>>>>>> e945785aacf87fcd64888c8f0f63130116b80f56
    }
    @And("The user enters the lastName (.*)$")
    public void the_user_enters_the_last_name(String lastName) {
        addUserPage.enterLastName(lastName);
    }

    @And("The user enters the userName (.*)$")
    public void the_user_enters_the_user_name(String userName) {
        addUserPage.enterUserName(userName);
    }

    @And("The user enters the password (.*)$")
    public void the_user_enters_the_password(String password) {
        addUserPage.enterPassword(password);
    }

    @And("The user selects the customer (.*)$")
    public void the_user_selects_the_customer(String companyName) {
       addUserPage.selectCompany(companyName);
    }

    @Given("The user selects the role (.*)$")
    public void the_user_selects_the_role_admin(String role) {
        addUserPage.selectRoleFromDropdown(role);
    }

    @Given("The user enters the email (.*)$")
    public void the_user_enters_the_email(String email) {
        addUserPage.enterEmail(email);
    }

    @Given("The user enters the cell phone (.*)$")
    public void the_user_enters_the_cell_phone(String cellPhone) {
        addUserPage.enterCellPhone(cellPhone);
    }

    @When("The user clicks the save button")
    public void the_user_clicks_the_save_button() {
        addUserPage.clickSaveButton();
    }
    @Then("The user validates that the user is added successfully")
    public void the_user_validates_that_the_user_is_added_successfully() {
        addUserPage.verifyTheUserIsAdded();
    }

}
