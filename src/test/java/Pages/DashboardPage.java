package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class DashboardPage {

    WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    // Learn dropdown
    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/button/span[2]")
    WebElement learnDropdown;

    // Learning Material option
    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/div/button[2]/span[2]")
    WebElement learningMaterialOption;

    // Web Automation option
    @FindBy(xpath = "//*[@id=\"tab-btn-web\"]/span[2]")
    WebElement webAutomationCard;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        actions = new Actions(driver);
    }

    // ✅ Hover or click Learn dropdown
    public void openLearnDropdown() {
        //actions.moveToElement(learnDropdown).perform();
        // If hover doesn't work, use click instead:
         learnDropdown.click();
    }

    // ✅ Click Learning Material
    public void clickLearningMaterial() {
        wait.until(elementToBeClickable(learningMaterialOption)).click();
    }

    // ✅ Click Web Automation
    public void clickWebAutomation() {
        wait.until(elementToBeClickable(webAutomationCard)).click();
    }

    // ✅ Full navigation (best practice)
    public void navigateToInventoryForm() {
        openLearnDropdown();
        clickLearningMaterial();
        clickWebAutomation();
    }
}