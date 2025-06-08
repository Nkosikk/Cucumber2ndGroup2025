package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class CartPage {

    public WebDriver driver;

    @FindBy(xpath = "//a[contains(text(),'Cart')]")
    WebElement cartButton_xpath;
    @FindBy(xpath = "//a[contains(text(),'Delete')]")
    WebElement productPage_xpath;
    @FindBy(xpath = "//table/tbody/tr/td[2]")
    WebElement productTitle_xpath;
    @FindBy(tagName = "table")
    WebElement table_tagName;
    @FindBy(tagName = "tr")
    WebElement row_tagName;

    @FindBy(xpath = "//button[contains(text(),'Place Order')]")
    WebElement placeOrderButton_xpath;

    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickCartMenu() {
        cartButton_xpath.click();
    }

    public void verifyAddedLaptopIsDisplayed(String name){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(productPage_xpath));
        // Extract rows
        List<WebElement> rows = table_tagName.findElements(By.tagName("tr"));
        // Loop through rows
        for(WebElement row : rows){
            // Extract columns (cells) from each row
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for(WebElement cell : cells){
                if (cell.getText().equals(name)){
                    Assert.assertEquals(cell.getText(),name);
                    break;
                }
            }
        }
    }

    public void clickPlaceOrderButton(){
        placeOrderButton_xpath.click();
    }
}




