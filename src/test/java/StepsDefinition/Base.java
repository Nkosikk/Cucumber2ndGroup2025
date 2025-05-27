package StepsDefinition;

import Pages.HomePage;
import Pages.LaptopPage;
import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.demoblaze.com/index.html");
    HomePage userTablePage = PageFactory.initElements(driver, HomePage.class);
    LaptopPage laptopPage = PageFactory.initElements(driver, LaptopPage.class);


}
