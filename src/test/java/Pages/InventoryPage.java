package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

public class InventoryPage {

    WebDriver driver;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "deviceType")
    WebElement device;

    @FindBy(id = "brand")
    WebElement brand;

    @FindBy(xpath = "//*[@id=\"inventory-form-grid\"]/div[4]/div/label[2]/span")
    WebElement storage;

    @FindBy(id = "color")
    WebElement color;

    @FindBy(id = "quantity")
    WebElement quantity;

    @FindBy(id = "address")
    WebElement address;

    @FindBy(xpath = "//button[contains(text(),'Next')]")
    WebElement next;

    @FindBy(id = "shipping-option-express")
    WebElement express;

    @FindBy(id = "warranty-option-1yr")
    WebElement warranty;

    @FindBy(id = "discount-code")
    WebElement discount;

    @FindBy(xpath = "//button[contains(text(),'Apply')]")
    WebElement apply;

    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement confirm;

    @FindBy(xpath = "//*[contains(text(),'Success')]")
    WebElement success;

    @FindBy(xpath = "//button[contains(text(),'View Invoice')]")
    WebElement viewInvoice;

    @FindBy(xpath = "//button[contains(text(),'View')]")
    WebElement openInvoice;

    public void fillForm() {
        new Select(device).selectByVisibleText("Phone");
        new Select(brand).selectByVisibleText("Apple");
        storage.click();
        new Select(color).selectByVisibleText("Blue");

        quantity.sendKeys("2");
        address.sendKeys("123 Test Street");
    }

    public void nextStep() {
        next.click();
    }

    public void selectExtras() {
        express.click();
        warranty.click();
    }

    public void applyDiscount() {
        discount.sendKeys("SAVE10");
        apply.click();
    }

    public void confirmOrder() {
        confirm.click();
    }

    public boolean isSuccessDisplayed() {
        return success.isDisplayed();
    }

    public void openInvoice() {
        viewInvoice.click();
        openInvoice.click();
    }
}