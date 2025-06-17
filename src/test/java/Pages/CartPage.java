package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    public WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//a[text()='Cart']")
    WebElement cartLink;

    @FindBy(xpath = "//a[contains(text(),'Sony vaio i5')]")
    WebElement cartItem;

    @FindBy(xpath = "//button[text()='Place Order']")
    WebElement placeOrderButton;

    //    public boolean isProductInCart(String laptopName) {
//        try {
//            WebElement product = driver.findElement(By.xpath("//td[text()='" + laptopName + "']"));
//            return product.isDisplayed();
//        } catch (Exception e) {
//            return false;
//        }

    public void verifyProductInTheCart(String productName) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(placeOrderButton));
        driver.findElement(By.xpath("//a[contains(text(),'" + productName + "')]"));



//        try {
//            WebElement cartItem = wait.until(ExpectedConditions.visibilityOfElementLocated(
//                    By.xpath("//a[contains(text(),'" + productName + "')]")));
//
//            return cartItem.getText().contains(productName);
//        } catch (Exception e) {
//            System.out.println("Product not found in the cart: " + productName);
//            return false;
//        }
    }
//    public boolean isProductInCart(String laptopName) {
//        try {
//            // Updated XPath to match the cart table structure
//            WebElement product = driver.findElement(By.xpath("//table[@id='cart']//a[contains(text(),'" + laptopName + "')]"));
//            return product.isDisplayed();
//        } catch (Exception e) {
//            return false;
//        }
//    }

    public void clickTheCartButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(cartLink));
        cartLink.click();
    }


//    public void clickTheCartButton() {
//        WebElement cartLink = driver.findElement(By.xpath("//a[text()='Cart']"));
//        cartLink.click();
//    }

//    public void clickPlaceOrder() {
//        WebElement placeOrderButton = driver.findElement(By.xpath("//button[text()='Place Order']"));
//        placeOrderButton.click();
//    }

}





