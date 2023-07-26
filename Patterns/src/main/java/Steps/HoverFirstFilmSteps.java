package Steps;

import Pages.HomePage;
import Pages.HoverFirstFilm;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HoverFirstFilmSteps {
    private WebDriver driver;
    private HoverFirstFilm hoverFirstFilm;
    public HoverFirstFilmSteps(WebDriver driver) {
        this.driver = driver;
        hoverFirstFilm = new HoverFirstFilm(driver);
    }
    public void clickMovieToBuy(int index) {
        List<WebElement> movieList = hoverFirstFilm.getMovieList();
        WebElement movieToClick = movieList.get(index);

        Actions actions = new Actions(driver);
        actions.moveToElement(movieToClick).perform();

        WebElement buyMovieButton = hoverFirstFilm.getBuyMovieButton();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", buyMovieButton);
    }
}
