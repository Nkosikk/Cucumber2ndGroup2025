package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    public WebDriver driver;

    @FindBy(xpath = "//a[contains(text(),'Home ')]")
    WebElement home_xpath;
    @FindBy(xpath = "//a[contains(text(),'Laptops')]")
    WebElement laptops_xpath;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void verifyHomePageIsVisible(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(home_xpath));
        home_xpath.isDisplayed();
    }

    public void clickOnTheName(String catagory){
        int attempts = 0;
        while (attempts < 6) {
            try {
                Thread.sleep(2000);
                WebElement element = driver.findElement(By.xpath("//a[contains(text(),'"+catagory+"')]"));
                element.click();
                break;
            } catch (StaleElementReferenceException e) {
                attempts++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}



