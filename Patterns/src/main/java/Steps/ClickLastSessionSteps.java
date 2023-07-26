package Steps;

import Pages.ClickLastSession;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ClickLastSessionSteps {
    private WebDriver driver;
    private ClickLastSession clickLastSession;

    public ClickLastSessionSteps(WebDriver driver) {
        this.driver = driver;
        clickLastSession = PageFactory.initElements(driver, ClickLastSession.class);
    }

    public void clickLastSession() {
        clickLastSession.clickLastSession();
    }
}
