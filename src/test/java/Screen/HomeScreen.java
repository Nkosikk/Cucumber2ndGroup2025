package Screen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class HomeScreen {
    WebDriver driver;

    @FindBy(xpath = "//a[@id='nava']")
    WebElement productStore_id;

    @FindBy(xpath = "//a[@onclick=\"byCat('notebook')\"]")
    WebElement laptopsCategory_xpath;

    @FindBy(xpath = "//*[@id=\"tbodyid\"]/div[1]/div/a/img")
    WebElement cartLink_id;

    public HomeScreen(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void verifyTheProductStoreIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(productStore_id));
        productStore_id.isDisplayed();
    }
    public void clickLaptopsCategory() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(laptopsCategory_xpath));
        laptopsCategory_xpath.click();
    }
    public void selectLaptop() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(cartLink_id));
        cartLink_id.click();
    }
}



