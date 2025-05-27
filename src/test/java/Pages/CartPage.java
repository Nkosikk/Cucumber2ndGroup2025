package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;
    By cartItem = By.cssSelector("#tbodyid > tr");
    By placeOrder = By.xpath("//button[text()='Place Order']");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isLaptopPresentInCart() {
        return driver.findElements(cartItem).size() > 0;
    }

    public void clickPlaceOrder() {
        driver.findElement(placeOrder).click();
    }
}
