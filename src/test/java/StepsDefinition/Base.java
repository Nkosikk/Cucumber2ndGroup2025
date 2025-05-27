package StepsDefinition;

import Pages.AddUserPage;
import Pages.UserTablePage;
import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.demoblaze.com/");
    UserTablePage userTablePage = PageFactory.initElements(driver, UserTablePage.class);


}
