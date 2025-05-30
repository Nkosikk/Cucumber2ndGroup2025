package Screen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutScreen {
    WebDriver driver;

    @FindBy(xpath = "//h5[@id='orderModalLabel']") WebElement placeOrderPageTitle_path;

    @FindBy(xpath = "//button[text()='Purchase']") WebElement purchaseButton_path;
    @FindBy(id = "name") WebElement nameInput_id;

    @FindBy(id = "country") WebElement countryInput_id;

    @FindBy(id = "city") WebElement cityInput_id;

    @FindBy(id = "card") WebElement creditCardInput_id;

    @FindBy(id = "month") WebElement monthInput_id;

    @FindBy(id = "year") WebElement yearInput_id;

    @FindBy(xpath = "//div[contains(@class,'sweet-alert')]") WebElement confirmationAlert_path;

    @FindBy(xpath = "//button[@class='confirm btn btn-lg btn-primary']") WebElement OkButton_path;

    public CheckoutScreen(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void verifyPlaceOrderPageIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(placeOrderPageTitle_path));
        placeOrderPageTitle_path.isDisplayed();
    }

    public void fillPlaceOrderForm(String name, String country, String city, String card, String month, String year) {
        nameInput_id.clear();
        nameInput_id.sendKeys(name);

        countryInput_id.clear();
        countryInput_id.sendKeys(country);

        cityInput_id.clear();
        cityInput_id.sendKeys(city);

        creditCardInput_id.clear();
        creditCardInput_id.sendKeys(card);

        monthInput_id.clear();
        monthInput_id.sendKeys(month);

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
    public void clickOKButton() {
        OkButton_path.click();
    }
}
