package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class PopUp extends SaveElements {
    private WebDriver driver;

    public PopUp(WebDriver driver) {
        this.driver = driver;
    }

    public void assertPopUpData(String expectedFilmName, String expectedCinemaTitle, String expectedPopUpDate) {
        String filmName2 = driver.findElement(By.className("movie-title")).getText();
        String cinemaTitle2 = driver.findElement(By.className("movie-cinema")).getText();
        String popapDate = driver.findElement(By.xpath("//div[@class='right-content']//p[@class='movie-cinema'][2]")).getText();

        Assert.assertEquals(filmName2, expectedFilmName, "Film name in the pop-up is incorrect");
        Assert.assertEquals(cinemaTitle2, expectedCinemaTitle, "Cinema title in the pop-up is incorrect");
        Assert.assertEquals(popapDate, expectedPopUpDate, "Pop-up date is incorrect");
    }
}