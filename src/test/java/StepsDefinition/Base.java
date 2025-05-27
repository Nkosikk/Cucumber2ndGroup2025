package StepsDefinition;

import Pages.HomePage;
import Pages.LaptopPage;
import Pages.ProductPage;
import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    WebDriver driver = browserFactory.startBrowser("chrome", "https://www.demoblaze.com/index.html");
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    LaptopPage laptopPage = PageFactory.initElements(driver, LaptopPage.class);
    ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);

}
