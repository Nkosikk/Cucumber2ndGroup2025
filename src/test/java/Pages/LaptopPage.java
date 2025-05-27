package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LaptopPage {
    WebDriver driver;
    By firstLaptop = By.cssSelector("#tbodyid .card-title a");

    public LaptopPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFirstLaptop() {
        driver.findElement(firstLaptop).click();
    }
}