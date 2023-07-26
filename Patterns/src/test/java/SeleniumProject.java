import Pages.HomePage;
import Pages.PopUp;
import Steps.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SeleniumProject {
    private WebDriver driver;
    private HomePageSteps homePageSteps;
    private HoverFirstFilmSteps hoverFirstFilmSteps;
    private ScrollToCaveaSteps scrollToCaveaSteps;
    private CheckCaveaSteps checkCaveaSteps;
    private ClickLastSessionSteps clickLastSessionSteps;
    private PopUp popUp;
    private ClickFreeSpace clickFreeSpace;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        homePageSteps = new HomePageSteps(driver);
        hoverFirstFilmSteps = new HoverFirstFilmSteps(driver);
        scrollToCaveaSteps = new ScrollToCaveaSteps(driver);
        checkCaveaSteps = new CheckCaveaSteps(driver);
        clickLastSessionSteps = new ClickLastSessionSteps(driver);
        popUp = new PopUp(driver);
        clickFreeSpace = new ClickFreeSpace(driver);
    }

    @Test
    public void SwoopTest() {
        driver.get("https://www.swoop.ge/");
        homePageSteps.clickMoviesLink();
        hoverFirstFilmSteps.clickMovieToBuy(0);
        scrollToCaveaSteps.scrollToCaveaAndClick();

        checkCaveaSteps.check()
                .clickLastDate();
//        clickLastSessionSteps.clickLastSession();
//        popUp.assertPopUpData("Expected Film Name", "Expected Cinema Title", "Expected Pop-up Date");

//        clickFreeSpace.clickRandomSeat();

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}