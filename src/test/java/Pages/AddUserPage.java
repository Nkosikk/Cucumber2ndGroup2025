package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

public class AddUserPage {
    public WebDriver driver;

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

    @FindBy(xpath = "//input[@type='radio']")
    WebElement companyType_xpath;

    @FindBy(xpath = "//select[@name='RoleId']")
    WebElement roleDropdown_xpath;

    public AddUserPage(WebDriver driver){
        this.driver = driver;
    }

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

    public void enterPassword(String password){
        passwordField_name.sendKeys(password);
    }

    public void selectCompanyType(String companyType){
        //The passed parameter is not used for now
       driver.findElement(By.xpath("//input[@type='radio'][1]")).click();

    }

    public void selectRole(String role){
        roleDropdown_xpath.click();
        Select dropdown = new Select(roleDropdown_xpath);
        dropdown.selectByContainsVisibleText(role);

    }
}
