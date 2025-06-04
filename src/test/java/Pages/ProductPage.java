package Pages;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {

    WebDriver driver;
    private String selectedProductName;

// product page elements and locators

    @FindBy(id = "nava")
    WebElement productPageHeader_id;

    @FindBy(xpath = "//a[contains(@class, 'list-group-item') and text()='Laptops']")
    WebElement categoryLaptop_xpath;

    @FindBy(xpath = "//a[contains(@class, 'hrefch') and text()='MacBook air']")
    WebElement macBookAir_xpath;


    @FindBy(xpath = "//a[text()='Add to cart']")
    WebElement addToCartButton_xpath;

    @FindBy(id = "cartur")
    WebElement cartButton_xpath;

    @FindBy(css = "#tbodyid > h2")
    WebElement productTitle;


    // Constructor to initialize the Webdriver
    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    // --- Step 1: Verify product page is displayed ---
    public void verifyProductPageIsDisplayed() {
        productPageHeader_id.isDisplayed();
    }

    // --- Step 2: Select product category ---
    public void selectProductCategory() {
        // Wait for the category element to be clickable if necessary
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(categoryLaptop_xpath));
        categoryLaptop_xpath.click();
    }


    // --- Step 3: Select product from category ---
    public void selectProductFromCategory() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(macBookAir_xpath));
        selectedProductName = macBookAir_xpath.getText();
        macBookAir_xpath.click();
    }

    public String getSelectedProductName() {
        return selectedProductName;
    }

    // --- Step 4: Verify product details ---
    public void verifyProductDetails() {
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(productTitle));
        String displayedProductName = productTitle.getText();
        if (!selectedProductName.equals(displayedProductName)) {
            throw new AssertionError("Product names do not match!");
        }

    }

    // --- Step 5: Click 'Add to cart' button ---
    public void clickAddToCartButton() {
        addToCartButton_xpath.click();
    }

    // --- Step 6: Handle alert after adding to cart ---
    public void handleAddToCartAlert() {
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        if (!alertText.contains("Product added")) {
            throw new AssertionError("Expected product added confirmation, but got: " + alertText);
        }
        alert.accept();
    }

    // Step 6.1: Click OK button on the popup
    public void clickOkButtonOnPopup() {
        Alert alert = driver.switchTo().alert();
        alert.accept(); // Clicks the OK button on the alert
    }

    // --- Step 7: Click cart button ---
    public void clickCartButton() {
        cartButton_xpath.click();
    }


}



