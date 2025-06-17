package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//a[text()='Laptops']")
    WebElement laptopsLink;

    public void clickOnLaptop() {
        laptopsLink.click();
    }

    public boolean isProductStoreDisplayed() {
        return driver.getTitle().contains("STORE");
    }


}







