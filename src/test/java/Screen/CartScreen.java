package Screen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartScreen {
    WebDriver driver;
    @FindBy(xpath = "//a[text()='Add to cart']") WebElement addToCartButton;
    @FindBy(linkText = "Cart") WebElement cartLink;
    @FindBy(xpath = "//*[@id='tbodyid']") WebElement addedLaptopName;
    @FindBy(xpath = "//button[@data-toggle='modal']") WebElement placeOrderButton;

    public CartScreen(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAddToCartButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(
                ExpectedConditions.elementToBeClickable(addToCartButton)
        );
        addToCartButton.click();
    }
    //pop up message
    public String expectedText;
    public void assertTextIsDisplayedAndAccept(String expectedText) {
        this.expectedText = expectedText;
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(
                ExpectedConditions.alertIsPresent()
        );
        driver.switchTo().alert().accept();
    }
    public void navigateToCart() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(
                ExpectedConditions.elementToBeClickable(cartLink)
        );
        cartLink.click();
    }
    public void getAddedLaptopName() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement laptop = wait.until(ExpectedConditions.visibilityOf(addedLaptopName));
        laptop.getText();
    }
    public void clickPlaceOrderButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(
                ExpectedConditions.elementToBeClickable(placeOrderButton)
        );
        placeOrderButton.click();
    }
}
