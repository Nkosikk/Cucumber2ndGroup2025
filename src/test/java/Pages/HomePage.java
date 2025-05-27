package Pages;


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
    public void verifyProductStoreIsDisplayed() {
        id_nava.click();
    }
    public void clickLaptopsCategory() {
        laptopsCategory.click();
    }

}
