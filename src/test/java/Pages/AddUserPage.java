package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddUserPage {
    WebDriver driver;

    @FindBy(xpath = "//form[@name='smartTableValidForm']")
    WebElement addUserPage_xpath;

    @FindBy(xpath = "//input[@name = 'FirstName']")
    WebElement firstNameField_xpath;

    @FindBy(xpath = "//input[@name = 'LastName']")
    WebElement lastNameField_xpath;

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

}
