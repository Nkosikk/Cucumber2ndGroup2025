package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.SecureRandom;
import java.time.Duration;

public class CartPage {

    WebDriver driver;


    // Cart page elements and locators

    @FindBy(xpath = "//a[contains(@class, 'hrefch') and text()='MacBook air']")
    WebElement macBookAir_xpath;

    @FindBy(xpath = "//button[text()='Place Order']")
    WebElement placeOrderButton_xpath;

    @FindBy(xpath = "//button[text()='Purchase']")
    WebElement purchaseButton_xpath;

    @FindBy(id = "orderModalLabel")
    WebElement placeOrderForm_id;

    @FindBy(id = "name")
    WebElement nameField_id;

    @FindBy(id = "country")
    WebElement countryField_id;

    @FindBy(id = "city")
    WebElement cityField_id;

    @FindBy(id = "card")
    WebElement cardField_id;

    @FindBy(id = "month")
    WebElement monthField_id;

    @FindBy(id = "year")
    WebElement yearField_id;




    // Constructor to initialize the Webdriver
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    // Step 8: Verify that selected product is in the cart
    public String getCartProductName() {
        return macBookAir_xpath.getText();
    }

    // Step 9: Click on Place Order button
    public void clickPlaceOrderButton() {
        placeOrderButton_xpath.click();
    }

    // Step 9.1: Verify Place Order form is displayed
    public void verifyPlaceOrderFormIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(placeOrderForm_id));
        placeOrderForm_id.isDisplayed();
    }

    // Step 10: Click purchase without filling the form
    public void clickPurchaseButton() {
        purchaseButton_xpath.click();
    }

    //Step 11: Error message popup and click OK button
    public void clickOkButtonOnErrorPopup() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {
            org.openqa.selenium.Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            alert.accept(); // Clicks the OK button
        } catch (Exception e) {
            throw new AssertionError("Expected alert was not present.", e);
        }

    }

    // Step 12: Fill in the place order form
    public void enterName() {
        nameField_id.sendKeys("John Doe");
    }

    public void enterCountry() {
        countryField_id.sendKeys("USA");
    }
    public void enterCity() {
        cityField_id.sendKeys("New York");
    }

    public void enterRandomCreditCard() {
        SecureRandom random = new SecureRandom();
        StringBuilder cardNumber = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            cardNumber.append(random.nextInt(10));
        }
        cardField_id.sendKeys(cardNumber.toString());
    }

    public void enterMonth() {
        monthField_id.sendKeys("May");
    }

    public void enterYear() {
        SecureRandom random = new SecureRandom();
        int year = 2023 + random.nextInt(10); // Random year between 2023 and 2032
        yearField_id.sendKeys(String.valueOf(year));
    }

    // Step 13: Click on purchase button again
    public void clickPurchaseButtonAgain() {
        purchaseButton_xpath.click();
    }

    // Step 14: Verify order confirmation
    public boolean isOrderConfirmed() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Thank you for your purchase!']")));
            return true;
        } catch (Exception e) {
            return false; // Order confirmation not found
        }
    }



}