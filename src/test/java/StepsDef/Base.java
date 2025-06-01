package StepsDef;

import Screen.CartScreen;
import Screen.CheckoutScreen;
import Screen.HomeScreen;
import utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.demoblaze.com/index.html");
    HomeScreen homeScreen = PageFactory.initElements(driver, HomeScreen.class);
    CartScreen cartScreen = PageFactory.initElements(driver, CartScreen.class);
    CheckoutScreen checkoutScreen = PageFactory.initElements(driver, CheckoutScreen.class);
}
