package StepsDefinition;

import Pages.HomePage;
import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.demoblaze.com/index.html");
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);


}
