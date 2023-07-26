package steps1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages1.HomePage;
import pages1.MoviesPage;

import java.util.List;

public class MovieSteps {
    private WebDriver driver;
    private HomePage homePage;
    private MoviesPage moviesPage;

    public MovieSteps(WebDriver driver) {
        this.driver = driver;
        homePage = new HomePage(driver);
        moviesPage = new MoviesPage(driver);
    }

    public void buyFirstMovieTicket() {
        homePage.navigateTo();
        homePage.clickMoviesLink();

        List<WebElement> movieList = moviesPage.getMovieList();
        WebElement firstMovie = movieList.get(0);
        moviesPage.hoverOverMovie(firstMovie);
        moviesPage.clickBuyButton();

        moviesPage.scrollToAndClickCavea();
        moviesPage.verifyCinemaTitles();
        moviesPage.selectLastDate();
        moviesPage.selectLastSession();
    }
}
