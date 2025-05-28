package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage {

    WebDriver driver;
    By cartLink = By.id("cartur");
    By productNameInCart = By.xpath("//td[2]");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToCart() {
        driver.findElement(cartLink).click();
    }

    public String getCartProductName() {
        return driver.findElement(productNameInCart).getText();
    }
}


//package pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//
//public class CartPage extends BasePage {
//
//    @FindBy(xpath = "//button[text()='Place Order']")
//    private WebElement placeOrderButton;
//
//    public CartPage(WebDriver driver) {
//        super(driver);
//    }
//
//    public void navigateToCart() {
//        driver.findElement(By.id("cartur")).click(); // Assuming 'cartur' is the ID for the cart link
//        wait.until(ExpectedConditions.visibilityOf(placeOrderButton)); // Wait for an element on the cart page
//    }
//
//    public boolean isProductAddedToCart(String productName) {
//        // Verify the added laptop is available [cite: 1]
//        return driver.findElements(By.xpath("//td[text()='" + productName + "']")).size() > 0;
//    }
//
//    public void clickPlaceOrder() {
//        placeOrderButton.click();
//    }
