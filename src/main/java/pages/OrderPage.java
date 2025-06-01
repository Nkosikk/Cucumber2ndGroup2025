package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class OrderPage {
    private WebDriver driver;

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By nameField = By.id("name");
    private By countryField = By.id("country");
    private By cityField = By.id("city");
    private By cardField = By.id("card");
    private By monthField = By.id("month");
    private By yearField = By.id("year");
    private By purchaseButton = By.xpath("//button[text()='Purchase']");
    private By confirmation = By.xpath("//h2[contains(text(),'Thank you')]");

    // Click Purchase without filling the form (to trigger validation)
    public void clickPurchaseWithoutData() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement purchaseBtn = wait.until(ExpectedConditions.elementToBeClickable(purchaseButton));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", purchaseBtn);
    }

    // Fill out the order form with provided data
    public void fillOrderForm(String name, String country, String city, String card, String month, String year) {
        driver.findElement(nameField).clear();
        driver.findElement(nameField).sendKeys(name);

        driver.findElement(countryField).clear();
        driver.findElement(countryField).sendKeys(country);

        driver.findElement(cityField).clear();
        driver.findElement(cityField).sendKeys(city);

        driver.findElement(cardField).clear();
        driver.findElement(cardField).sendKeys(card);

        driver.findElement(monthField).clear();
        driver.findElement(monthField).sendKeys(month);

        driver.findElement(yearField).clear();
        driver.findElement(yearField).sendKeys(year);
    }

    // Click the Purchase button with JS click to avoid interception issues
    public void clickPurchase() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement purchaseBtn = wait.until(ExpectedConditions.elementToBeClickable(purchaseButton));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", purchaseBtn);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", purchaseBtn);
    }

    // Check if order confirmation message is displayed
    public boolean isOrderConfirmed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.presenceOfElementLocated(confirmation)).isDisplayed();
    }
}
