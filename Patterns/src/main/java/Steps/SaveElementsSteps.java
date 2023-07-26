package Steps;

import Pages.SaveElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SaveElementsSteps {
    private WebDriver driver;
    private SaveElements saveElements;

    public SaveElementsSteps(WebDriver driver) {
        this.driver = driver;
        saveElements = PageFactory.initElements(driver, SaveElements.class);
    }

    public String getLastFilmHours() {
        List<WebElement> films = saveElements.getFilms();
        WebElement lastFilmEl = films.get(films.size() - 1);
        return lastFilmEl.getAttribute("innerHTML");
    }

    public String getLastDate() {
        List<WebElement> lastDateNumber = saveElements.getLastDateNumber();
        String text1 = lastDateNumber.get(lastDateNumber.size() - 1).getText();
        return text1.replaceAll("\\D+", "");
    }

    public String getFilmDetails() {
        String filmName = saveElements.getFilmName().getText();
        String cinemaTitle = saveElements.getCinemaTitle().getText();
        return filmName + " - " + cinemaTitle;
    }


}

