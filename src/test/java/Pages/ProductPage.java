package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ProductPage {
    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }


    @FindBy(xpath = "//a[text()='Add to cart']")
    WebElement addToCartButton_xpath;


    public void addToCartButton() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(addToCartButton_xpath));
        addToCartButton_xpath.click();
    }

    public void getAlertText(String message) throws InterruptedException {
        Thread.sleep(5000);
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        Assert.assertEquals(alertText, message);
    }

    public void clickOkButton() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }


}