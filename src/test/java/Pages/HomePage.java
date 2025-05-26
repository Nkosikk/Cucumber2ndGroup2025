package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"nava\"]")
    WebElement ProductStore_xpath;
    @FindBy(linkText = "Laptops")
    WebElement Laptop_xpath;
    @FindBy(xpath = "//a[contains(text(),'Sony vaio i5')]")
    WebElement Sonyvaioi5_xpath;
    @FindBy(xpath = "//*[@id=\"tbodyid\"]/div[2]/div/a")
    WebElement addToCart_xpath;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyProductStoreIsDisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(ProductStore_xpath));
        ProductStore_xpath.isDisplayed();

    }
    public void clickLaptopsButton() {
        Laptop_xpath.click();

    }
    public void clickSonyVaioI5() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(Sonyvaioi5_xpath));
        Sonyvaioi5_xpath.click();
    }
    public void clickAddToCart() {
        addToCart_xpath.click();
    }
}
