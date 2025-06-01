package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtils {
    public static void takeScreenshot(WebDriver driver, String stepName) {
        try {
            // Skip screenshot if an alert is open
            try {
                driver.switchTo().alert();
                System.out.println("⚠️ Alert is present. Skipping screenshot for step: " + stepName);
                return;
            } catch (NoAlertPresentException ignored) {
            }

            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String fileName = "screenshots/" + stepName + "_" + timestamp + ".png";

            FileUtils.copyFile(srcFile, new File(fileName));
            System.out.println("📸 Screenshot taken: " + fileName);
        } catch (Exception e) {
            System.err.println("❌ Failed to take screenshot at step: " + stepName);
            e.printStackTrace();
        }
    }
}
