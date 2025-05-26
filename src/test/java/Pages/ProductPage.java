package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class ProductPage {
    WebDriver driver;

    @FindBy(id = "nava")
    WebElement verifyhomePage_id;

    @FindBy(id = "cat")
    WebElement category_id;

    @FindBy(xpath = "//a[@class= 'list-group-item']")
    List<WebElement> item_xpath;

    @FindBy(xpath = "//*[@id=\"tbodyid\"]/div[3]/div/div/h4/a")
    WebElement productName_xpath;

    @FindBy(className = "name")
    WebElement verifyproductname_name;

    @FindBy(xpath = "//a[@class='btn btn-success btn-lg']")
    WebElement addToCart_xpath;

    @FindBy(id = "cartur")
    WebElement clickoncart_id;


    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyHomePageisDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(verifyhomePage_id));
        Assert.assertTrue(verifyhomePage_id.isDisplayed());
        System.out.println(verifyhomePage_id.getText());
    }

    public void verifycategoriesisDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(category_id));
        Assert.assertTrue(category_id.isDisplayed());
        System.out.println("Categories are displayed");
        for (WebElement item : item_xpath) {
            System.out.println("Category: " + item.getText());
        }

    }

    public void clickoncategoryproductType(String categories) throws InterruptedException {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfAllElements(item_xpath));
        boolean found = false;
        for (WebElement item : (item_xpath)) {
            if (item.getText().trim().equalsIgnoreCase(categories.trim())) {
                item.click();
                found = true;
                break;
            }
        }
        Assert.assertTrue(found, "Category '" + categories + "' not found in the list!");
        Thread.sleep(Long.parseLong("5000")); // Wait for the page to load after clicking the category

    }

    public void clickonProductName(String product) throws InterruptedException {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(productName_xpath));
        Assert.assertEquals(productName_xpath.getText(), product, "Product name does not match!");
        productName_xpath.click();
        Thread.sleep(Long.parseLong("2000")); // Wait for the product details page to load
    }

    public void verifyproductname(String expectedProductType, String verifyproductnameName) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(verifyproductname_name));
        Assert.assertEquals(verifyproductname_name.getText(), "MacBook air", "Product name is not displayed correctly!");
        System.out.println("Product name is displayed correctly: " + verifyproductname_name.getText());
    }

    public void clickonAddToCart() throws InterruptedException {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(addToCart_xpath));
        addToCart_xpath.click();
        Thread.sleep(Long.parseLong("2000")); // Wait for the alert to appear
    }

    public void clickonCart() throws InterruptedException {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(clickoncart_id));
        clickoncart_id.click();
        System.out.println("Clicked on cart");
        Thread.sleep(2000);
    }


}






