package Steps;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
public class HomePageSteps {
    private WebDriver driver;
    private HomePage homePage;

    public HomePageSteps(WebDriver driver) {
        this.driver = driver;
        homePage = new HomePage(driver);
    }

    public void clickMoviesLink() {
        homePage.moviesLink.click();
    }

}