package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserFactory {

    public static WebDriver driver;

    public static WebDriver startBrowser(String browserChoice, String url) {
        if (driver == null) {
            switch (browserChoice.toLowerCase()) {
                case "chrome":
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments(url);
//                    chromeOptions.addArguments("--headless");
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
            driver.manage().window().maximize();
            driver.get(url);
        }
        return driver;
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            throw new IllegalStateException("Browser has not been started. Call startBrowser() first.");
        }
        return driver;
    }

    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
