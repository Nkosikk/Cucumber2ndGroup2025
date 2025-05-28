package StepsDefinition;

import Pages.CartPage;
import Pages.HomePage;
import Pages.LaptopPage;
import Pages.CheckOutPage;
import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    WebDriver driver = browserFactory.startBrowser("chrome", "https://www.demoblaze.com/index.html");
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    CheckOutPage checkOutPage = PageFactory.initElements(driver, CheckOutPage.class);
    LaptopPage laptopPage = PageFactory.initElements(driver, LaptopPage.class);
    CartPage cartPage = PageFactory.initElements(driver, CartPage.class);

}
