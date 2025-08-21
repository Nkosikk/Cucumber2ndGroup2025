package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PlaceOrderPage {
    WebDriver driver;

    @FindBy(xpath = "//h5[@id='orderModalLabel']") WebElement placeOrderPageTitle_path;
    @FindBy(xpath = "//*[@onclick=\"purchaseOrder()\"] ") WebElement purchaseButton_path;
    @FindBy(id = "name") WebElement nameInput_id;
    @FindBy(id = "country") WebElement countryInput_id;
    @FindBy(id = "city") WebElement cityInput_id;
    @FindBy(id = "card") WebElement creditCardInput_id;
    @FindBy(id = "month") WebElement monthInput_id;
    @FindBy(id = "year") WebElement yearInput_id;
    @FindBy(xpath = "//div[contains(@class,'sweet-alert')]") WebElement confirmationAlert_path;

// Constructor

    public PlaceOrderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void verifyPlaceOrderPageIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(placeOrderPageTitle_path));
        placeOrderPageTitle_path.isDisplayed();
    }

    public void insertName(String name){
        nameInput_id.clear();
        nameInput_id.sendKeys(name);
    }
    public void insertYourCountryName(String country){
        countryInput_id.clear();
        countryInput_id.sendKeys(country);
    }
    public void insertYourCity(String city){
        cityInput_id.clear();
        cityInput_id.sendKeys(city);
    }
     public void insertYourCardNumber(String card){
        creditCardInput_id.clear();
        creditCardInput_id.sendKeys(card);
    }
    public void insertTheMonth(String month){
        monthInput_id.clear();
        monthInput_id.sendKeys(month);
    }
    public void insertTheYear(String year){
        yearInput_id.clear();
        yearInput_id.sendKeys(year);
    }

    public void clickPurchaseButton() {
        purchaseButton_path.click();
    }
    public String errorText;
    public void errorTextIsDisplayedAndPressOK(String errorText) {
        this.errorText = errorText;
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }
    public void getConfirmationAlertText() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(confirmationAlert_path));
        confirmationAlert_path.getText();
    }
}