package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    WebDriver driver;

    // Locate the "Laptops" category element
    @FindBy(linkText = "Laptops")
    WebElement laptopsCategory;

    // Constructor to initialize the WebDriver and PageFactory elements
    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Method to click on the "Laptops" category
    public void clickOnLaptops() {
        laptopsCategory.click();
        System.out.println("Clicked on the 'Laptops' category.");
    }
}