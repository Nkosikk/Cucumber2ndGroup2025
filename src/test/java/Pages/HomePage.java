package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    WebDriver driver;
    @FindBy(id = "nava")
    WebElement id_nava;

    @FindBy(xpath = "//a[contains(text(),'Laptops')]")
    WebElement laptopsCategory;


    public HomePage(WebDriver driver) {

        this.driver = driver;
    }
    public boolean isHomePageDisplayed() {
        id_nava.click();
        return id_nava.isDisplayed();
    }
    public void clickLaptopsCategory() {
        laptopsCategory.click();
    }

    public void clickCartButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement cartButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("cartur")));
        cartButton.click();
    }
}
