package StepsDef;


import Screen.CartScreen;
import Screen.HomeScreen;
import utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.demoblaze.com/index.html");
    HomeScreen homeScreen = PageFactory.initElements(driver, HomeScreen.class);
    CartScreen cartScreen = PageFactory.initElements(driver, CartScreen.class);

}
