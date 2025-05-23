package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {
    WebDriver driver;

    @FindBy(id = "nava")
    WebElement verifyhomePage_id;

    @FindBy(id = "cat")
    WebElement category_id;

    @FindBy(id = "itemc")
    WebElement item_id;

    @FindBy(className = "hrefch")
    WebElement productName_class;

    @FindBy(name = "name")
    WebElement verifyproductname_id;

    @FindBy(xpath = "//*[@id=\"tbodyid\"]/div[2]/div/a")
    WebElement addToCart_xpath;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyHomePageisDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(verifyhomePage_id));
        verifyhomePage_id.isDisplayed();
    }

    public void verifycategoriesisDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(category_id));
        category_id.isDisplayed();
    }

    public void clickoncategoryproductType(String categories) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(item_id));
        item_id.click();
    }

    public void clickonProductName(String product) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(productName_class));
        productName_class.click();
    }

    public boolean verifyproductname() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(verifyproductname_id));
        return verifyproductname_id.isDisplayed();
    }

    public void clickonAddToCart() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(addToCart_xpath));
        addToCart_xpath.click();
    }


}
