package StepsDefinition;

import Pages.HomePage;
import Pages.PlaceOrderFormPage;
import Pages.ProductPage;
import Pages.CartPage; // Import CartPage
import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    public final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.demoblaze.com/index.html");
    public HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    public ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
    public CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
    public PlaceOrderFormPage placeOrderPage = PageFactory.initElements(driver, PlaceOrderFormPage.class);

}
