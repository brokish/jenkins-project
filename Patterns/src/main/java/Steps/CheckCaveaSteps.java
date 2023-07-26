package Steps;

import Pages.CheckCavea;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class CheckCaveaSteps {
    private WebDriver driver;
    private CheckCavea checkCavea;

    public CheckCaveaSteps(WebDriver driver) {
        this.driver = driver;
        checkCavea = new CheckCavea(driver);
    }

    public CheckCaveaSteps check() {
        List<WebElement> cinemaTitles = checkCavea.getCinemaTitles();
        for (WebElement cinemaTitle : cinemaTitles) {
            if (cinemaTitle.isDisplayed()) {
                String expectedTitle = "კავეა ისთ ფოინთი";
                String actualTitle = cinemaTitle.getText();
                Assert.assertEquals(actualTitle, expectedTitle, "Cinema title mismatch.");
            }
        }
        return this;
    }

    public CheckCaveaSteps clickLastDate() {
        checkCavea.clickLastDate();
        return this;
    }
}