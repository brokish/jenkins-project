import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps1.MovieSteps;
import steps1.popupsteps;

import java.util.concurrent.TimeUnit;

public class SwoopTest {
    private WebDriver driver;
    private MovieSteps movieSteps;
    private popupsteps steps;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        movieSteps = new MovieSteps(driver);
        steps = new popupsteps(driver);
    }

    @Test
    public void buyMovieTicketTest() {
        movieSteps.buyFirstMovieTicket();
        steps.selectRandomSeat();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
