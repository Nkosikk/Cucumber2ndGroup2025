
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By homeTitle = By.xpath("//a[@class='navbar-brand']");
    private By laptopsCategory = By.xpath("//a[text()='Laptops']");

    public boolean isAtHomePage() {
        return driver.findElement(homeTitle).getText().contains("PRODUCT STORE");
    }

    public void clickLaptopsCategory() {
        driver.findElement(laptopsCategory).click();
    }
}
