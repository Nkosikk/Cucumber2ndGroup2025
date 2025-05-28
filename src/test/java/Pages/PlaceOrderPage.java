package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


    public class PlaceOrderPage extends Base {

        @FindBy(id = "name")
        private WebElement nameField;
        @FindBy(id = "country")
        private WebElement countryField;
        @FindBy(id = "city")
        private WebElement cityField;
        @FindBy(id = "card")
        private WebElement creditCardField;
        @FindBy(id = "month")
        private WebElement monthField;
        @FindBy(id = "year")
        private WebElement yearField;
        @FindBy(xpath = "//button[text()='Purchase']")
        private WebElement purchaseButton;
        @FindBy(css = ".sweet-alert > h2")
        private WebElement orderConfirmationHeader;
        @FindBy(css = ".sa-confirm-button-container > button")
        private WebElement okButton;


        public PlaceOrderPage(WebDriver driver) {
            super(driver);
        }

        public void enterOrderDetails(String name, String country, String city, String creditCard, String month, String year) {
            nameField.sendKeys(name);
            countryField.sendKeys(country);
            cityField.sendKeys(city);
            creditCardField.sendKeys(creditCard);
            monthField.sendKeys(month);
            yearField.sendKeys(year);
        }

        public void clickPurchase() {
            purchaseButton.click();
        }

        public String getPurchaseConfirmationMessage() {
            wait.until(ExpectedConditions.visibilityOf(orderConfirmationHeader));
            return orderConfirmationHeader.getText();
        }

        public String getErrorMessage() {
            wait.until(ExpectedConditions.alertIsPresent());
            return driver.switchTo().alert().getText();
        }

        public void acceptErrorMessage() {
            driver.switchTo().alert().accept();
        }

        public void clickOkOnConfirmation() {
            okButton.click();
        }
}
