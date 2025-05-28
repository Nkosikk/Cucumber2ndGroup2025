package Utilities;

public class BrowserFactory {

    public static WebDriver createBrowser(String browserType) {
        WebDriver driver = null;
        if (browserType.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
            driver = new ChromeDriver();
        } else if (browserType.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");
            driver = new FirefoxDriver();
        } else if (browserType.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "path/to/edgedriver");
            driver = new EdgeDriver();
        }
        // Add more browsers as needed
        return driver;
    }


}









package utilities;

import org.openqa.selenium.WebDriver;
public static WebDriver getDriver() {
    if (driver == null) {
        String browser = System.getProperty("browser", "chrome"); // Default to chrome, can be overridden by -Dbrowser=firefox
        switch (browser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            // Add more browsers as needed
            default:
                throw new IllegalArgumentException("Browser " + browser + " not supported.");
        }
        driver.manage().window().maximize();
    }
    return driver;
}

public static void closeDriver() {
    if (driver != null) {
        driver.quit();
        driver = null; // Reset for next test run
    }
}
}import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

    private static WebDriver driver;


