package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class PlaceOrderFormPage {

    public WebDriver driver;

    @FindBy(xpath = "//button[contains(text(),'Purchase')]")
    WebElement purchaseButton_xpath;

    @FindBy(id = "name")
    WebElement name_id;
    @FindBy(id = "country")
    WebElement country_id;
    @FindBy(id = "city")
    WebElement city_id;
    @FindBy(id = "card")
    WebElement card_id;
    @FindBy(id = "month")
    WebElement month_id;
    @FindBy(id = "year")
    WebElement year_id;

    @FindBy(xpath = "//h2[contains(text(),'Thank you for your purchase!')]")
    WebElement confirmationMessage_xpath;
    @FindBy(xpath = "//button[contains(text(),'OK')]")
    WebElement okButton_xpath;
    @FindBy(xpath = "//button[contains(text(),'Close')]")
    WebElement closeButton_xpath;


    public PlaceOrderFormPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickPurchaseButton(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(purchaseButton_xpath));
        purchaseButton_xpath.click();
    }

    public void verifyPopupErrorMessage() throws InterruptedException {
        Thread.sleep(4000);
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        Assert.assertEquals(alertText,"Please fill out Name and Creditcard.");
        alert.accept();
    }

    public void enterName(String name){
        name_id.sendKeys(name);
    }

    public void enterCountry(String country){
        country_id.sendKeys(country);
    }

    public void enterCity(String city){
        city_id.sendKeys(city);
    }

    public void enterCreditCard(String creditCard){
        card_id.sendKeys(creditCard);
    }

    public void enterMonth(String month){
        month_id.sendKeys(month);
    }

    public void enterYear(String year){
        year_id.sendKeys(year);
    }

    public void verifyOrderWasSuccessfullyPurchased() throws InterruptedException {

        driver.switchTo().activeElement().isDisplayed();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(confirmationMessage_xpath));
        confirmationMessage_xpath.isDisplayed();
        okButton_xpath.click();
        driver.navigate().back();
//        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(closeButton_xpath));
        //closeButton_xpath.click();

    }

}


