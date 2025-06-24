package Steps;


import Pages.CartPage;
import Pages.HomePage;

import Pages.PlaceOrderPage;
import Utills.BrowserFactory;
import Utills.ExcelReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
// First we need to create the browserFactary Opject class to the browser

    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.demoblaze.com/index.html");
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
    PlaceOrderPage placeOrderPage = PageFactory.initElements(driver, PlaceOrderPage.class);
    ExcelReader excelReader = PageFactory.initElements(driver, ExcelReader.class);


}