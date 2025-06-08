package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ProductPage {

    public WebDriver driver;

    @FindBy(xpath = "//a[contains(text(),'Add to cart')]")
    WebElement addToCartButton_xpath;

    public ProductPage(WebDriver driver){
        this.driver = driver;
    }

    public void addToCart() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(addToCartButton_xpath));
        addToCartButton_xpath.click();

    }

    public void confirmItemIsAdded(String message) throws InterruptedException {
        Thread.sleep(4000);
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        Assert.assertEquals(alertText,message);
    }

    public void clickOkButton(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}