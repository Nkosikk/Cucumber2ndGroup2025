package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddUserPage {

    WebDriver driver;

    @FindBy(xpath = "/html/body/div[2]/div[1]/h3")
    WebElement AddUserForm_xpath;

    @FindBy(xpath = "/html/body/div[2]/div[2]/form/table/tbody/tr[1]/td[2]/input")
    WebElement firstNameColumn_xpath;

    @FindBy(xpath = "/html/body/div[2]/div[2]/form/table/tbody/tr[2]/td[2]/input")
    WebElement lastNameColumn_xpath;

    @FindBy(xpath = "/html/body/div[2]/div[2]/form/table/tbody/tr[3]/td[2]/input")
    WebElement userNameColumn_xpath;

    @FindBy(xpath = "/html/body/div[2]/div[2]/form/table/tbody/tr[4]/td[2]/input")
    WebElement passwordColumn_xpath;

    @FindBy(xpath = "/html/body/div[2]/div[2]/form/table/tbody/tr[5]/td[2]/label[1]/input")
    WebElement customerAAA_xpath;

    @FindBy(xpath = "//button[contains(.,'Add User')]")
    WebElement addUserButton_xpath;

    public AddUserPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyAddUserFormIsDisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(AddUserForm_xpath));
        AddUserForm_xpath.isDisplayed();
    }

    public void enterFirstName(String firstName) {
        firstNameColumn_xpath.sendKeys(firstName);
    }
    public void enterLastName(String lastName) {
        lastNameColumn_xpath.sendKeys(lastName);
    }

    public void enterUserName(String userName) {
        userNameColumn_xpath.sendKeys(userName);
    }

    public void enterPassword(String password) {
        passwordColumn_xpath.sendKeys(password);
    }

    public void clickCustomerButton() {
        customerAAA_xpath.click();

    public void clickAddUserButton() {
        addUserButton_xpath.click();

    }

}
