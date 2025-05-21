package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
<<<<<<< HEAD
import org.openqa.selenium.support.ui.Select;
=======
>>>>>>> e945785aacf87fcd64888c8f0f63130116b80f56
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddUserPage {
    WebDriver driver;
<<<<<<< HEAD

    @FindBy(xpath = "/html/body/div[2]/div[1]/h3")
    WebElement addUserFormTitle_xpath;

    @FindBy(xpath = "//input[@name='FirstName']")
    WebElement firstNameInput_xpath;

    @FindBy(xpath = "/html/body/div[2]/div[2]/form/table/tbody/tr[2]/td[2]/input")
    WebElement lastNameInput_xpath;

    @FindBy(xpath = "/html/body/div[2]/div[2]/form/table/tbody/tr[3]/td[2]/input")
    WebElement userNameInput_xpath;

    @FindBy(xpath = "/html/body/div[2]/div[2]/form/table/tbody/tr[4]/td[2]/input")
    WebElement passwordInput_xpath;

    @FindBy(xpath = "/html/body/div[2]/div[2]/form/table/tbody/tr[5]/td[2]/label[1]")
    WebElement CompanyAAA_xpath;

    @FindBy(xpath = "/html/body/div[2]/div[2]/form/table/tbody/tr[5]/td[2]/label[2]")
    WebElement CompanyBBB_xpath;

    @FindBy(xpath = "/html/body/div[2]/div[2]/form/table/tbody/tr[6]/td[2]/select")
    WebElement roleCustomer_xpath;

    @FindBy(xpath = "/html/body/div[2]/div[2]/form/table/tbody/tr[7]/td[2]/input")
    WebElement emailInput_xpath;

    @FindBy(xpath = "/html/body/div[2]/div[2]/form/table/tbody/tr[8]/td[2]/input")
    WebElement cellPhoneInput_xpath;

    @FindBy(xpath = "/html/body/div[2]/div[3]/button[2]")
    WebElement saveButton_xpath;

    @FindBy(className = "header-content ng-scope ng-binding")
    WebElement FirstName_HeaderContent_xpath;

    public AddUserPage(WebDriver driver) {
        this.driver = driver;
    }
    public void verifyAddUserFormIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(addUserFormTitle_xpath));
        addUserFormTitle_xpath.isDisplayed();
    }
    public void enterFirstName(String firstName) {
        firstNameInput_xpath.sendKeys(firstName);
    }
    public void enterLastName(String lastName) {
        lastNameInput_xpath.sendKeys(lastName);
    }

    public void enterUserName(String userName){
        userNameInput_xpath.sendKeys(userName);
    }
    public void enterPassword(String password) {
        passwordInput_xpath.sendKeys(password);
    }
    public void selectCompany(String companyName) {
        if (companyName.equalsIgnoreCase("Company AAA")) {
            CompanyAAA_xpath.click();
        } else {
            CompanyBBB_xpath.click();
        }
    }
    public void selectRoleFromDropdown(String roleName) {
        Select roleDropdown = new Select(roleCustomer_xpath);
        roleDropdown.selectByVisibleText(roleName);
    }
    public void enterEmail(String email) {
        emailInput_xpath.sendKeys(email);
    }
    public void enterCellPhone(String cellPhone) {
        cellPhoneInput_xpath.sendKeys(cellPhone);
    }
    public void clickSaveButton(){
        saveButton_xpath.click();
    }
    public void verifyTheUserIsAdded() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(FirstName_HeaderContent_xpath));
        FirstName_HeaderContent_xpath.isDisplayed();
    }
=======
>>>>>>> e945785aacf87fcd64888c8f0f63130116b80f56

    @FindBy(xpath = "//form[@name='smartTableValidForm']")
    WebElement addUserPage_xpath;

    @FindBy(xpath = "//input[@name = 'FirstName']")
    WebElement firstNameField_xpath;

    @FindBy(xpath = "//input[@name = 'LastName']")
    WebElement lastNameField_xpath;

    @FindBy(name = "UserName")
    WebElement userNameField_xpath;

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
}
