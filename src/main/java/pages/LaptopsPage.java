
package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LaptopsPage {
    private WebDriver driver;

    public LaptopsPage(WebDriver driver) {
        this.driver = driver;
    }

    private By firstLaptop = By.xpath("(//a[@class='hrefch'])[1]");
    private By addToCartButton = By.xpath("//a[text()='Add to cart']");

    public void selectFirstLaptop() {
        driver.findElement(firstLaptop).click();
    }

    public void addToCart() throws InterruptedException {
        Thread.sleep(1000); // Ensure product page is loaded
        driver.findElement(addToCartButton).click();
        Thread.sleep(2000); // Wait for alert
    }

    public boolean handlePopupAlert() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            alert.accept();
            return alertText.contains("Product added");
        } catch (Exception e) {
            return false;
        }
    }
}
