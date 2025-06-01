package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CartPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"page-wrapper\"]/div/div[1]/h2")
    WebElement verifyproductcartpage_xpath;

    @FindBy(xpath = "//*[@id=\"page-wrapper\"]/div/div[2]/h2")
    WebElement verifytotalpricelabel_xpath;

    @FindBy(id = "totalp")
    WebElement totalprice_id;

    @FindBy(xpath = "//button[@class = 'btn btn-success']")
    WebElement placeorderbutton_name;

    @FindBy(id = "orderModalLabel")
    WebElement verifyplaceorderpopup_id;

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

    @FindBy(xpath = "//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")
    WebElement purchaseButton_xpath;

    @FindBy(xpath = "/html/body/div[10]/h2")
    WebElement orderconfirmation_xpath;

    @FindBy(xpath = "//button[@class='confirm btn btn-lg btn-primary']")
    WebElement okButton_xpath;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    //verify that you are in the cart page.
    public void verifyProductCartPage() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(verifyproductcartpage_xpath));
        Assert.assertTrue(verifyproductcartpage_xpath.isDisplayed());
        System.out.println(verifyproductcartpage_xpath.getText());
    }

    //verify that the total price label is displayed.
    public void verifyTotalPriceLabel() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(verifytotalpricelabel_xpath));
        Assert.assertTrue(verifytotalpricelabel_xpath.isDisplayed());
        System.out.println(verifytotalpricelabel_xpath.getText());
    }

    //verify the correct total price is calculated,
    public void verifytotalprice() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(totalprice_id));
        String totalPriceValue = totalprice_id.getText();
        System.out.println("Total price is: " + totalPriceValue);

    }

    //Click on the place order button
    public void clickplaceorderbutton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(placeorderbutton_name));
        placeorderbutton_name.click();
        System.out.println("Place order button clicked.");
    }

    //verify that the place order popup is displayed.
    public void setVerifyplaceorderpopup_id() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(verifyplaceorderpopup_id));
        Assert.assertTrue(verifyplaceorderpopup_id.isDisplayed());
        System.out.println("Place order form is displayed.");
    }



    //Fill in the name field in the place order popup.
    public void enterName(String name) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(name_id));
        name_id.sendKeys(name);
    }

    //Fill in the country field in the place order popup

    public void enterCountry(String country) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(country_id));
        country_id.sendKeys(country);
    }

    //Fill in the city field in the place order popup
    public void enterCity(String city) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(city_id));
        city_id.sendKeys(city);

    }

    //Fill in the credit card field in the place order popup
    public void enterCreditCard(String card) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(card_id));
        card_id.sendKeys(card);
    }

    //Fill in the month field in the place order popup
    public void enterMonth(String month) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(month_id));
        month_id.sendKeys(month);
    }

    //Fill in the city field in the place order popup
    public void enterYear(String year) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(year_id));
        year_id.sendKeys(year);
    }

    //Click on the place order button in the place order popup
    public void clickPurchaseButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(purchaseButton_xpath));
        purchaseButton_xpath.click();
        System.out.println("Place order button in the popup clicked.");
        Thread.sleep(2000);

    }

    //Verify that the order confirmation message is displayed
    public void verifyOrderConfirmation() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(orderconfirmation_xpath));
        Assert.assertTrue(orderconfirmation_xpath.isDisplayed());
        System.out.println("Order confirmation message: " + orderconfirmation_xpath.getText());
    }

    //Click on the OK button in the order confirmation popup
    public void clickOkButton() throws InterruptedException {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(okButton_xpath));
        okButton_xpath.click();
        System.out.println("OK button clicked in the order confirmation popup.");
        Thread.sleep(2000);
    }


}


