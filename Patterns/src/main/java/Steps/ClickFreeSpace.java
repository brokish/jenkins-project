package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ClickFreeSpace {
    private WebDriver driver;

    @FindBy(css = "div.seat.free")
    private List<WebElement> seats;

    public ClickFreeSpace(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickRandomSeat() {
        int randomIndex = (int) (Math.random() * seats.size());
        seats.get(randomIndex).click();
    }
}
