package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    WebDriver driver;

    @FindBy(id = "cartur")
    WebElement cartLink;

    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    WebElement productNameCell;

    @FindBy(xpath = "//button[text()='Place Order']")
    WebElement placeOrderButton;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToCart() {
        cartLink.click();
    }

    public boolean isLaptopListed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            WebElement laptopRow = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody/tr[1]/td[2]")));
            return laptopRow.isDisplayed();
        } catch (TimeoutException e) {
            System.out.println("Laptop not listed in cart.");
            return false;
        }
    }


    public void clickPlaceOrder() {
        placeOrderButton.click();
    }
}
