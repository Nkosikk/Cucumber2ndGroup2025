package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LaptopsPage {
    WebDriver driver;

    public LaptopsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectLaptop(String laptopName) {
        WebElement laptopLink = driver.findElement(By.xpath("//a[contains(text(),'" + laptopName + "')]"));
        laptopLink.click();
    }
}







