package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class CheckOutPage {
    WebDriver driver;


    public CheckOutPage(WebDriver driver) {

        this.driver = driver;
    }

    public void clickPurchase() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Purchase')]"))).click();
    }

    public void popUpMessage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        System.out.println("Alert says: " + alert.getText());
        alert.accept();
    }
    public void fillInName(String name) {
        WebElement nameField = driver.findElement(By.id("name"));
        nameField.clear();
        nameField.sendKeys(name);
    }
    public void fillInCountry(String country) {
        WebElement countryField = driver.findElement(By.id("country"));
        countryField.clear();
        countryField.sendKeys(country);
    }
    public void fillInCity(String city) {
        WebElement cityField = driver.findElement(By.id("city"));
        cityField.clear();
        cityField.sendKeys(city);
    }
    public void fillInCreditCard(Long creditCard) {
        WebElement creditCardField = driver.findElement(By.id("card"));
        creditCardField.clear();
        creditCardField.sendKeys(String.valueOf(creditCard));
    }
    public void fillInMonth(String month) {
        WebElement monthField = driver.findElement(By.id("month"));
        monthField.clear();
        monthField.sendKeys(month);
    }
    public void fillInYear(String year) {
        WebElement yearField = driver.findElement(By.id("year"));
        yearField.clear();
        yearField.sendKeys(year);
    }
    public void clickOnPurchase() {
        WebElement purchaseButton = driver.findElement(By.xpath("//button[text()='Purchase']"));
        purchaseButton.click();
    }
    public void verifyPurchaseConfirmation() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String expectedMessage = "Thank you for your purchase!";
        String actualMessage = alert.getText();
        Assert.assertTrue(actualMessage.contains(expectedMessage), "Purchase confirmation message is not as expected: " + actualMessage);
        alert.accept();
    }
}
