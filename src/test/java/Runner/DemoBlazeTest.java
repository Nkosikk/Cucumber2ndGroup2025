package Runner;

import pages.*;
import utils.ExcelUtils;
import utils.ScreenshotUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoBlazeTest extends BaseTest {
    HomePage homePage;
    LaptopsPage laptopsPage;
    CartPage cartPage;
    OrderPage orderPage;

    String[] orderData;

    @Test(priority = 1)
    public void launchSiteAndVerifyHome() {
        test = extent.createTest("Launch Site and Verify Home Page");
        driver.get("https://www.demoblaze.com/index.html");
        ScreenshotUtils.takeScreenshot(driver, "01_HomePage_Loaded");

        homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isAtHomePage(), "Not on Home Page");
        ScreenshotUtils.takeScreenshot(driver, "02_HomePage_Verified");
    }

    @Test(dependsOnMethods = "launchSiteAndVerifyHome")
    public void selectLaptopAndAddToCart() throws InterruptedException {
        test = extent.createTest("Select Laptop and Add to Cart");

        homePage.clickLaptopsCategory();
        ScreenshotUtils.takeScreenshot(driver, "03_LaptopsCategory_Clicked");

        laptopsPage = new LaptopsPage(driver);
        laptopsPage.selectFirstLaptop();
        ScreenshotUtils.takeScreenshot(driver, "04_Laptop_Selected");

        laptopsPage.addToCart();
        Assert.assertTrue(laptopsPage.handlePopupAlert(), "Product not added");
        ScreenshotUtils.takeScreenshot(driver, "05_ProductAddedAlertHandled");
    }

    @Test(dependsOnMethods = "selectLaptopAndAddToCart")
    public void verifyCartAndPlaceOrder() throws InterruptedException {
        test = extent.createTest("Verify Cart and Place Order");

        cartPage = new CartPage(driver);
        cartPage.goToCart();
        Thread.sleep(2000);
        ScreenshotUtils.takeScreenshot(driver, "06_CartOpened");

        Assert.assertTrue(cartPage.isProductInCart(), "Product not found in cart");
        ScreenshotUtils.takeScreenshot(driver, "07_ProductVerifiedInCart");

        cartPage.clickPlaceOrder();
        ScreenshotUtils.takeScreenshot(driver, "08_ClickedPlaceOrder");
    }

    @Test(dependsOnMethods = "verifyCartAndPlaceOrder")
    public void tryPurchaseWithoutData() {
        test = extent.createTest("Try Purchase Without Data");

        orderPage = new OrderPage(driver);
        ScreenshotUtils.takeScreenshot(driver, "09_OrderPageOpened");

        orderPage.clickPurchaseWithoutData();
        ScreenshotUtils.takeScreenshot(driver, "10_ClickedPurchaseWithoutData");
    }

    @Test(dependsOnMethods = "tryPurchaseWithoutData")
    public void completeOrderAndVerifyPurchase() throws InterruptedException {
        test = extent.createTest("Complete Order and Verify Purchase");

        orderData = ExcelUtils.readOrderData("data/OrderData.xlsx", "Order");
        orderPage.fillOrderForm(orderData[0], orderData[1], orderData[2],
                orderData[3], orderData[4], orderData[5]);
        ScreenshotUtils.takeScreenshot(driver, "11_FilledOrderForm");

        orderPage.clickPurchase();
        Thread.sleep(2000);
        ScreenshotUtils.takeScreenshot(driver, "12_ClickedPurchase");

        Assert.assertTrue(orderPage.isOrderConfirmed(), "Order was not confirmed");
        ScreenshotUtils.takeScreenshot(driver, "13_OrderConfirmed");
    }

    @Test(dependsOnMethods = "tryPurchaseWithoutData")
    public void completeOrderWithExcelData() {
        test = extent.createTest("Complete Order with Valid Data");

        String filePath = "data/OrderData.xlsx";
        String sheetName = "Order";
        String[] data = ExcelUtils.readOrderData(filePath, sheetName);

        orderPage.fillOrderForm(
                data[0], data[1], data[2], data[3], data[4], data[5]
        );
        ScreenshotUtils.takeScreenshot(driver, "14_FilledOrderFormWithExcel");

        orderPage.clickPurchase();
        ScreenshotUtils.takeScreenshot(driver, "15_ClickedPurchaseWithExcel");

        Assert.assertTrue(orderPage.isOrderConfirmed(), "Order was not confirmed");
        ScreenshotUtils.takeScreenshot(driver, "16_OrderConfirmedWithExcel");
    }
}
