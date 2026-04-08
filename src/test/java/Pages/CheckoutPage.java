package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class CheckoutPage {

    WebDriver driver;
    WebDriverWait wait;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By orderPreview = By.xpath("//div[@id='orderPreview']");
    By expressShipping = By.xpath("//input[@id='expressShipping']");
    By warranty = By.xpath("//input[@id='warranty']");
    By discount = By.xpath("//input[@id='discount']");
    By confirmBtn = By.xpath("//button[text()='Confirm Purchase']");
    By successToast = By.xpath("//div[contains(text(),'Success')]");
    By viewInvoice = By.xpath("//button[text()='View Invoice']");
    By invoicePanel = By.xpath("//div[@id='invoicePanel']");
    By openInvoice = By.xpath("//button[text()='View']");

    public boolean isOrderPreviewDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(orderPreview)).isDisplayed();
    }

    public void selectExpressShipping() {
        driver.findElement(expressShipping).click();
    }

    public void selectWarranty() {
        driver.findElement(warranty).click();
    }

    public void applyDiscount(String code) {
        driver.findElement(discount).sendKeys(code);
    }

    public void clickConfirmPurchase() {
        driver.findElement(confirmBtn).click();
    }

    public boolean isSuccessMessageDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(successToast)).isDisplayed();
    }

    public void clickViewInvoice() {
        driver.findElement(viewInvoice).click();
    }

    public boolean isInvoicePanelDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(invoicePanel)).isDisplayed();
    }

    public void openInvoice() {
        driver.findElement(openInvoice).click();
    }
}
