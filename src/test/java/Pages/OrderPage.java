package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderPage {
    WebDriver driver;

    @FindBy(id = "name") WebElement nameField;
    @FindBy(id = "country") WebElement countryField;
    @FindBy(id = "city") WebElement cityField;
    @FindBy(id = "card") WebElement cardField;
    @FindBy(id = "month") WebElement monthField;
    @FindBy(id = "year") WebElement yearField;

    @FindBy(xpath = "//button[text()='Purchase']")
    WebElement purchaseButton;

    @FindBy(xpath = "//p[contains(text(),'Please fill out')]")
    WebElement errorMessage;

    @FindBy(css = ".sweet-alert h2")
    WebElement successMessage;

    public OrderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillForm(String name, String country, String city, String card, String month, String year) {
        nameField.sendKeys(name);
        countryField.sendKeys(country);
        cityField.sendKeys(city);
        cardField.sendKeys(card);
        monthField.sendKeys(month);
        yearField.sendKeys(year);
    }

    public void clickPurchase() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement purchaseButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Purchase']")));
        purchaseButton.click();
    }


    public boolean isErrorDisplayed() {
        return errorMessage.isDisplayed();
    }

    public boolean isSuccessDisplayed() {
        return successMessage.getText().contains("Thank you");
    }
}

