package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SaveElements {
    @FindBy(xpath = "//div[@id='384933']//div[@aria-hidden='false']//a//p[1]")
    private List<WebElement> films;

    @FindBy(xpath = "//div[contains(@class,'ui-tabs-panel')][@aria-expanded='true']/div/ul/li[last()]")
    private List<WebElement> lastDateNumber;

    @FindBy(css = "p.name")
    private WebElement filmName;

    @FindBy(xpath = "//a[@href='#384933']")
    private WebElement cinemaTitle;

    @FindBy(xpath = "//div[contains(@class,'ui-tabs-panel')][@aria-expanded='true']/div/div[@aria-hidden = 'false'][last()]/a")
    private List<WebElement> lastSession;


    public List<WebElement> getFilms() {

        return films;
    }

    public List<WebElement> getLastDateNumber() {

        return lastDateNumber;
    }

    public WebElement getFilmName() {
        return filmName;
    }

    public WebElement getCinemaTitle() {

        return cinemaTitle;
    }

}
