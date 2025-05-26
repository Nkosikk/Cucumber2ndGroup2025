package StepsDefinition;


import Pages.CartPage;
import Pages.ProductPage;
import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    static BrowserFactory browserFactory = new BrowserFactory();
    static final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.demoblaze.com/index.html");
    ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
    CartPage cartPage = PageFactory.initElements(driver, CartPage.class);

}