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

    @FindBy(xpath = "//*[@onclick='addToCart(8)']")
    WebElement addToCartButton_xpath;

    @FindBy(xpath = "//a[@onclick='showcart()']")
    WebElement cartLink_xpath;
    ////*[@id="navbarExample"]/ul/li[4]/a
    @FindBy(xpath = "//*[@id='tbodyid']/tr/td[2]")
    WebElement addedLaptopName_xpath;

    @FindBy(xpath = "//button[text()='Place Order']")
    WebElement placeOrderButton_xpath;

    public CartScreen(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAddToCartButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(addToCartButton_xpath));
        addToCartButton_xpath.click();
    }
    public void navigateToCart() {
        cartLink_xpath.click();
    }
    public String getAddedLaptopName() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(addedLaptopName_xpath));
        String laptopName = addedLaptopName_xpath.getText();
        System.out.println("Laptop Name in Cart: " + laptopName);
        return laptopName;
    }
    public void clickPlaceOrderButton() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(placeOrderButton_xpath));
        placeOrderButton_xpath.click();
    }
}
