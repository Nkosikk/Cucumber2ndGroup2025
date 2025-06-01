
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    private By cartLink = By.id("cartur");
    private By productRow = By.xpath("//tr[@class='success']");
    private By placeOrderButton = By.xpath("//button[text()='Place Order']");

    public void goToCart() {
        driver.findElement(cartLink).click();
    }

    public boolean isProductInCart() {
        return driver.findElements(productRow).size() > 0;
    }

    public void clickPlaceOrder() {
        driver.findElement(placeOrderButton).click();
    }
}
