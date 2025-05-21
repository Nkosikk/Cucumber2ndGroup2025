package StepsDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Random;

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
        addUserPage.verifyAddUserPageIsDisplayed();
    }

    @And("The user enters the firstName (.*)$")
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

        String Username = firstName + lastName + randomNumber;
        addUserPage.enterUserName(Username);
    }

    @And("The user enters the password (.*)$")
    public void theUserEntersThePassword(String password) {
        // Generate a random number
        Random random = new Random();
        int randomNumber = random.nextInt(100); // Generates a random number between 0 and 99
        // Append the random number to the password
        String passwordWithRandomNumber = password + randomNumber;
        // Enter the password
        addUserPage.enterPassword(passwordWithRandomNumber);
        System.out.println("Password entered: " + passwordWithRandomNumber);
    }

    @And("The user select the customerType (.*)$")
    public void theUserSelectTheCustomerType(String customerType) {
        addUserPage.selectCustomerRadio(customerType);
        if (customerType.equalsIgnoreCase("Company AAA")) {
            System.out.println("Company AAA radio button is selected");
        } else if (customerType.equalsIgnoreCase("Company BBB")) {
            System.out.println("Company BBB radio button is selected");
        } else {
            System.out.println("Invalid customer type");
        }

    }

}

