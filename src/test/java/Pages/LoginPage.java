package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    WebDriver driver;

    @FindBy(id = "user-name")
    WebElement usernameField_id;
    @FindBy(id = "password")
    WebElement passwordField_id;
    @FindBy(id = "login-button")
    WebElement loginButton_id;
    @FindBy(xpath = "//span[contains(text(),'Products')]")
    WebElement landingPageDisplayed_xpath;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void loginPageDisplayed(){
        usernameField_id.isDisplayed();
    }
    public void enterUsername(String username){
        usernameField_id.sendKeys(username);
    }
    public void enterPassword(String password){
        passwordField_id.sendKeys(password);
    }
    public void clickLoginButton(){
        loginButton_id.click();
    }
    public boolean landingPageDisplayed(){
        return landingPageDisplayed_xpath.isDisplayed();
    }
}
