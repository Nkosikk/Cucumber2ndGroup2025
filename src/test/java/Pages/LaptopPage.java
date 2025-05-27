package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LaptopPage {
    WebDriver driver;
    By firstLaptop = By.cssSelector("#tbodyid .card-title a");

    public LaptopPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectLaptop() {
        driver.findElement(firstLaptop).click();
    }

    public boolean isLaptopPageDisplayed() {
        return driver.getTitle().contains("Laptops");
    }
    public String getLaptopName() {
        return driver.findElement(firstLaptop).getText();
    }

    public void clickAddToCartButton() {
        By addToCartButton = By.linkText("Add to cart");
        driver.findElement(addToCartButton).click();
    }
}