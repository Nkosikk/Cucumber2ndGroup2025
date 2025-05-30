package StepsDef;

import Screen.CartScreen;
import Screen.CheckoutScreen;
import Screen.HomeScreen;
import utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    protected WebDriver driver;
    protected HomeScreen homeScreen;
    protected CartScreen cartScreen;
    protected CheckoutScreen checkoutScreen;

    public Base() {
        driver = BrowserFactory.startBrowser("chrome", "https://www.demoblaze.com/index.html");
        homeScreen = PageFactory.initElements(driver, HomeScreen.class);
        cartScreen = PageFactory.initElements(driver, CartScreen.class);
        checkoutScreen = PageFactory.initElements(driver, CheckoutScreen.class);
    }
}
