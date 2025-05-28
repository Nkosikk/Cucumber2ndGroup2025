package StepsDefinition;

//import Pages.AddUserPage;
//import Pages.UserTablePage;
import Pages.ProductPage;
import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome"
            , "https://www.demoblaze.com/index.html");

    ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
//    AddUserPage addUserPage = PageFactory.initElements(driver, AddUserPage.class);

}
