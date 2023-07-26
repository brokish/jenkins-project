package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ClickLastSession {
    @FindBy(xpath = "//div[contains(@class,'ui-tabs-panel')][@aria-expanded='true']/div/div[@aria-hidden = 'false'][last()]/a")
    private List<WebElement> lastSession;

    public void clickLastSession() {
        lastSession.get(lastSession.size() - 1).click();
    }
}
