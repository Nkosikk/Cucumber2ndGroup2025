package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    WebDriver driver;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCartButton_id;
    @FindBy(xpath = "//span[contains(text(),'1')]")
    WebElement cartIcon_xpath;

    public HomePage(WebDriver driver){
        this.driver = driver;

    }
    public void clickAddToCartButton(){
        addToCartButton_id.click();
    }

    public boolean isItemAddedToCart(){
        return cartIcon_xpath.isDisplayed();
    }
}
