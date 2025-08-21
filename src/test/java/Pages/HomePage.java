package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class HomePage {

    WebDriver driver;
    @FindBy(xpath = "//*[@id='nava']") WebElement productStore_xpath;
    @FindBy(xpath = "//a[@onclick=\"byCat('notebook')\"]") WebElement laptopsCategory_xpath;
    @FindBy(xpath = "//a[text()='MacBook air']") WebElement laptop_xpath;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void verifyTheProductStoreIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(productStore_xpath));
        productStore_xpath.isDisplayed();
    }
    public String arg0;
    public void clickLaptopsCategory(String arg0) {
        this.arg0 = arg0;
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(
                ExpectedConditions.visibilityOf(laptopsCategory_xpath)
        );
        laptopsCategory_xpath.click();
    }
    public void selectLaptop() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(
                ExpectedConditions.elementToBeClickable(laptop_xpath)
        );
        laptop_xpath.click();
    }
}
// Go to the base and call the homepage object