package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckCavea {
    private WebDriver driver;

    @FindBy(xpath = "//div[@id='384933']//ul[@class='tabs ui-tabs-nav ui-helper-reset ui-helper-clearfix ui-widget-header ui-corner-all']//following-sibling::div//p[@class='cinema-title']")
    private List<WebElement> cinemaTitles;
    @FindBy(xpath = "//div[contains(@class,'ui-tabs-panel')][@aria-expanded='true']/div/ul/li[last()]")
    private List<WebElement> lastDate;
    public CheckCavea(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public List<WebElement> getCinemaTitles() {
        return cinemaTitles;
    }


    public void clickLastDate() {
        lastDate.get(lastDate.size() - 1).click();
    }


}