package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUserPage {

    WebDriver driver;

    @FindBy(xpath = "//h3[contains(.,'Add User')]")
    WebElement addUserLabel_xpath;

    @FindBy(name ="FirstName")
    WebElement firstNameField_name;

    @FindBy(name = "LastName")
    WebElement lastNameField_name;

    @FindBy(name = "UserName")
    WebElement userNameField_name;

    @FindBy(name = "Password")
    WebElement passwordField_name;

    @FindBy(xpath = "//label[2]/input")
    WebElement customerType_xpath;

    //@FindBy(xpath ="/html/body/div[2]/div[2]/form/table/tbody/tr[6]/td[2]/select/option[3]")
    @FindBy(xpath = "//select[@name='RoleId']/option[2]")
    WebElement role_xpath;

    @FindBy(name = "Email")
    WebElement emailField_name;

    @FindBy(name = "Mobilephone")
    WebElement phoneField_name;

    @FindBy(xpath = "//button[contains(.,'Save')]")
    WebElement saveButton_xpath;

   // @FindBy(xpath = "/html/body/table/tbody/tr[1]/td[1]")
//   @FindBy(xpath = "//div[contains(@class, 'alert-success')]")
//   WebElement successMessage_xpath;

//    @FindBy(xpath = "//table//tr[td[contains(.,'UserName')]]")
//    WebElement addedUserRow_xpath;

    public AddUserPage (WebDriver driver) {
        this.driver = driver;
    }
    public void verifyAddUserFormIsDisplayed() {
        addUserLabel_xpath.isDisplayed();
    }
    public void enterFirstName(String firstName) {
        firstNameField_name.sendKeys(firstName);
    }
    public void enterLastName(String lastName) {
        lastNameField_name.sendKeys(lastName);
    }
    public void enterUserName(String userName) {
        userNameField_name.sendKeys(userName);
    }
    public void enterPassword(String password) {
        passwordField_name.sendKeys(password);
    }
    public void selectCustomerType() {
        customerType_xpath.click();
    }
    public void selectRole() {
        role_xpath.click();
    }
    public void enterEmail(String email) {
        emailField_name.sendKeys(email);
    }
    public void enterPhone(String phone) {
        phoneField_name.sendKeys(phone);
    }
    public void clickSaveButton() {
        saveButton_xpath.click();
    }
//    public boolean isUserAddedSuccessfully(String userName) {
//        // Validate success message
//        if (successMessage_xpath.isDisplayed()) {
//            return successMessage_xpath.getText().contains("User added successfully");
//        }
//        // Validate user in the list
//        WebElement userRow = driver.findElement(By.xpath("//table//tr[td[contains(.,'" + userName + "')]]"));
//        return userRow.isDisplayed();
//    }

//    public void isUserRowDisplayed() {
//        addedUserRow_xpath.isDisplayed();
//    }

}
