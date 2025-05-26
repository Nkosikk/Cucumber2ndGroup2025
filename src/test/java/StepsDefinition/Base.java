package StepsDefinition;

import Pages.AddUserPage;
import Pages.HomePage;
import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.demoblaze.com/index.html");
    HomePage userTablePage = PageFactory.initElements(driver, HomePage.class);
    AddUserPage addUserPage = PageFactory.initElements(driver, AddUserPage.class);

}
