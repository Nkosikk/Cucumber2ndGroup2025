package StepsDef;


import Screen.CartScreen;
import Screen.HomeScreen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserFactory;


public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.way2automation.com/angularjs-protractor/webtables/");
    HomeScreen homeScreen = PageFactory.initElements(driver, HomeScreen.class);
    CartScreen cartScreen = PageFactory.initElements(driver, CartScreen.class);

}
