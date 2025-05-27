package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

    public class ProductPage extends Base {

        @FindBy(css = ".btn.btn-success.btn-lg")
        private WebElement addToCartButton;

        public ProductPage(WebDriver driver) {
            super(driver);
        }

        public void clickOnLaptop(String laptopName) {
            // Dynamic locator for clicking on any laptop [cite: 1]
            WebElement laptopLink = driver.findElement(By.xpath("//a[text()='" + laptopName + "']"));
            laptopLink.click();
        }

        public void clickAddToCart() {
            addToCartButton.click();
        }

        public String getPopupMessage() {
            wait.until(ExpectedConditions.alertIsPresent());
            return driver.switchTo().alert().getText();
        }

        public void acceptPopup() {
            driver.switchTo().alert().accept();
        }
}
