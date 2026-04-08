package Tests;

import Pages.DashboardPage;
import Pages.HomePage;
import Pages.InventoryPage;
import Pages.LoginPage;
//import Util/s.BrowserFactory;
import Utils.DriverFactory;
//import Utils.TakeScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    DriverFactory browserFactory = new DriverFactory();

    final WebDriver driver = DriverFactory.startBrowser("chrome","https://ndosisimplifiedautomation.vercel.app/");

    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    DashboardPage dashboardPage= PageFactory.initElements(driver,DashboardPage.class);
    InventoryPage inventoryPage= PageFactory.initElements(driver,InventoryPage.class);
    //TakeScreenshots takeScreenshots = new TakeScreenshots();
}
