package Pages;



import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HomePage {
    WebDriver driver;

    @FindBy(className = "navbar-brand")
    WebElement productStoreText;

    @FindBy(linkText = "Laptops")
    WebElement laptopsCategory;

    //@FindBy(css = ".card-title a")
   // java.util.List<WebElement> laptops;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isProductStoreVisible() {
        return productStoreText.isDisplayed();
    }

    public void clickLaptopsCategory() {
        laptopsCategory.click();

        // Wait until laptops are visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".card-title a")));
    }


    public void clickFirstLaptop() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".card-title a")));

        List<WebElement> laptops = driver.findElements(By.cssSelector(".card-title a"));
        laptops.get(0).click();
    }


}

