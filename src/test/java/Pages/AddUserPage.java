package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AddUserPage {
    WebDriver driver;

    @FindBy(xpath = "//form[@name='smartTableValidForm']")
    WebElement addUserPage_xpath;

    @FindBy(xpath = "//input[@name = 'FirstName']")
    WebElement firstNameField_xpath;

    @FindBy(xpath = "//input[@name = 'LastName']")
    WebElement lastNameField_xpath;

    @FindBy(name = "UserName")
    WebElement userNameField_xpath;

    @FindBy(name = "Password")
    WebElement passwordField_name;

    @FindBy(name = "optionsRadios")
    List<WebElement> customerRadioButtons;

    @FindBy(name = "RoleId")
    WebElement roleIdDdown_name;

    public void verifyAddUserPageIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(addUserPage_xpath));
        addUserPage_xpath.isDisplayed();
    }

    public void enterFirstName(String firstName) {
        firstNameField_xpath.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameField_xpath.sendKeys(lastName);
    }

    public void enterUserName(String username) {
        userNameField_xpath.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField_name.sendKeys(String.valueOf(password));

    }

    @Deprecated
    public void selectCustomerRadio(String customerType) {
        for (WebElement radioButton : customerRadioButtons) {
            if (radioButton.getAttribute("value").equalsIgnoreCase(customerType)) {
                radioButton.click();
                break;
            }
        }
    }

    public void selectRoleId(String roleId) {
        Select.selectByVisibleText(roleIdDdown_name, roleId);

    }
}

