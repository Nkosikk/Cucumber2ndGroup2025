package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;



    public class HomePage extends Base {

        @FindBy(id = "nava")
        private WebElement productStoreTitle;

        @FindBy(xpath = "//a[text()='Laptops']")
        private WebElement laptopsCategoryLink;

        public HomePage(WebDriver driver) {
            super(driver);
        }

        public boolean isProductStoreTitleDisplayed() {
            wait.until(ExpectedConditions.visibilityOf(productStoreTitle));
            return productStoreTitle.isDisplayed();
        }

        public void clickLaptopsCategory() {
            laptopsCategoryLink.click();
        }
}
