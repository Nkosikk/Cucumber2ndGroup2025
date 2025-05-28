package Pages;

import StepsDefinition.Base;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends Base {

    WebDriver driver;

// product page elements and locators

    @FindBy(id = "nava")
    WebElement productPageHeader_id;

    @FindBy(id = "itemc")
    WebElement categoryLaptop_id;

    @FindBy(xpath = "//a[contains(@class, 'hrefch') and text()='MacBook air']")
    WebElement macBookAir_xpath;

    @FindBy(xpath = "//button[text()='Add to cart']")
    WebElement addToCartButton_xpath;

    @FindBy(id = "cartur")
    WebElement cartButton_xpath;




    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }


    public void verifyProductPageIsDisplayed() {
        productPageHeader_id.isDisplayed();
    }

    public void selectProductCategory() {
        categoryLaptop_id.click();
    }

    private String selectedProductName;

    public void selectProductFromCategory() {
        selectedProductName = macBookAir_xpath.getText();
        macBookAir_xpath.click();
    }

    public void verifyProductDetails() {
        WebElement productTitle = driver.findElement(By.cssSelector(".name")); // adjust selector as needed
        String displayedProductName = productTitle.getText();
        if (!selectedProductName.equals(displayedProductName)) {
            throw new AssertionError("Product names do not match!");
        }
    }

    public void clickAddToCartButton(){
        addToCartButton_xpath.click();
    }

    //Handling the popup after adding to cart
    public void handleAddToCartPopup() {
        WebElement popup = driver.findElement(By.id("cartModal")); // adjust selector as needed
        if (popup.isDisplayed()) {
            WebElement okButton = popup.findElement(By.xpath("//button[text()='OK']"));
            okButton.click();
        } else {
            throw new AssertionError("Add to cart popup did not appear!");
        }
    }

    public void clickCartButton() {
        cartButton_xpath.click();
    }


}



