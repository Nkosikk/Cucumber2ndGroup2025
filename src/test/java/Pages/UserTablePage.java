package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UserTablePage {

    WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'First Name')]")
    WebElement firstNameLabel_xpath;

    public UserTablePage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyUserTableIsDisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(firstNameLabel_xpath));
        firstNameLabel_xpath.isDisplayed();
    }
}
