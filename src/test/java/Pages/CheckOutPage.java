package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class CheckOutPage {
    WebDriver driver;
    @FindBy(id = "nava")
    WebElement id_nava;


    public CheckOutPage(WebDriver driver) {


        this.driver = driver;
    }

    public void clickPurchase() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Purchase')]"))).click();
    }
    public void clickOK() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String actualText = alert.getText();
        System.out.println("Alert says: " + actualText);
        Assert.assertEquals(actualText, actualText);
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
    public void popUpMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement confirmationModal = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//h2[text()='Thank you for your purchase!']")));
        Assert.assertTrue(confirmationModal.isDisplayed(), "Confirmation modal is not displayed.");

    }
    public void clickOk() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Thank you for your purchase!']")));
        WebElement okButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='OK']")));
        okButton.click();
    }

    public void productStore() {
        id_nava.click();
        id_nava.isDisplayed();
    }



}
