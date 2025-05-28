package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

/**
 * BasePage class serves as a base for all page classes in the application.
 * It initializes the WebDriver and provides common functionalities like explicit waits and screenshot handling.
 */

public class Base {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public Base(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // You can make this configurable
    }

    // Common methods like taking screenshots, explicit waits can go here
    public void takeScreenshot(String screenshotName) {
        // Implement screenshot logic here (e.g., using TakesScreenshot interface) [cite: 1]
    }
}
