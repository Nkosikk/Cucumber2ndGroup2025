package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    public static WebDriver driver;

    public static void initializeDriver(String browserChoice, String url) {
        if (driver == null) {
            startBrowser(browserChoice, url);
        }
    }

    public static void startBrowser(String browserChoice, String url) {
        switch (browserChoice.toLowerCase()) {
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                driver = new ChromeDriver(chromeOptions);
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                throw new IllegalArgumentException("Unsupported browser: " + browserChoice);
        }
        driver.get(url);
        driver.manage().window().maximize();
    }
}