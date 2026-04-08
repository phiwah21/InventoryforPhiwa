package Tests;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import Utils.ReadFromFile;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class InventoryTest extends Base {

    public void verifyHomePageIsDisplayed() {
        homePage.verifyHomePageIsDisplayed();
        //takeScreenshots.takeSnapShots(driver, "HomePageScreenshot001");
    }

    @Test(dependsOnMethods = "verifyHomePageIsDisplayed")
    public void clickLoginButton() {
        homePage.clickLoginButton();
    }

    @Test(dependsOnMethods = "clickLoginButton")
    public void userEnterEmail() {
        loginPage.enterEmail(ReadFromFile.email);
    }

    @Test(dependsOnMethods = "userEnterEmail")
    public void userEnterPassword() {
        loginPage.enterPassword(ReadFromFile.password);
    }

    @Test(dependsOnMethods = "userEnterPassword")
    public void userClicksLoginButton() {
        loginPage.clickLoginButton();
    }

    @Test(dependsOnMethods = "userClicksLoginButton")
    public void loginPageIsDisplayed(){
        loginPage.verifyLoginPageIsDisplayed();
    }
    @Test(dependsOnMethods = "loginPageIsDisplayed")
    public void navigateToInventoryForm() {
        dashboardPage.navigateToInventoryForm();
    }
    @Test(dependsOnMethods = "navigateToInventoryForm")
    public void fillInventoryForm() {

        inventoryPage.fillForm();
        inventoryPage.nextStep();
        inventoryPage.selectExtras();
        inventoryPage.applyDiscount();
        inventoryPage.confirmOrder();
    }
    @Test(dependsOnMethods = "fillInventoryForm")
    public void verifyOrderSuccess() {
        Assert.assertTrue(inventoryPage.isSuccessDisplayed());
    }
    //@AfterTest
    //public void closeBrowser() {
       // driver.quit();
   // }

}
