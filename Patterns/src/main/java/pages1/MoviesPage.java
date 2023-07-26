package pages1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class MoviesPage {
    private WebDriver driver;

    public MoviesPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getMovieList() {
        return driver.findElements(By.xpath("//div[@class='MenuItems container']//img[@alt='Alternate Text']"));
    }

    public void hoverOverMovie(WebElement movie) {
        Actions actions = new Actions(driver);
        actions.moveToElement(movie).perform();
    }

    public void clickBuyButton() {
        WebElement buyButton = driver.findElement(By.xpath("//div[@class='movies-deal'][1]//p[contains(text(),'ყიდვა')]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", buyButton);
    }
    public void scrollToAndClickCavea() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement scrollToCavea = driver.findElement(By.xpath("//ul[contains(@class,'cinema-tabs')]//a[text()= 'კავეა ისთ ფოინთი']"));
        js.executeScript("arguments[0].scrollIntoView(); window.scrollBy(0,-100);", scrollToCavea);
        scrollToCavea.click();
    }
    public List<WebElement> getCinemaTitles() {
        return driver.findElements(By.xpath("//div[@id='384933']//ul[@class='tabs ui-tabs-nav ui-helper-reset ui-helper-clearfix ui-widget-header ui-corner-all']//following-sibling::div//p[@class='cinema-title']"));
    }

    public void verifyCinemaTitles() {
        List<WebElement> cinemaTitles = getCinemaTitles();

        for (WebElement cinemaTitle : cinemaTitles) {
            if (cinemaTitle.isDisplayed()) {
                String expectedTitle = "კავეა ისთ ფოინთი";
                String actualTitle = cinemaTitle.getText();
                assertEquals(actualTitle, expectedTitle);
            }
        }
    }

    public void selectLastDate() {
        List<WebElement> lastDates = driver.findElements(By.xpath("//div[contains(@class,'ui-tabs-panel')][@aria-expanded='true']/div/ul/li[last()]"));
        lastDates.get(lastDates.size() - 1).click();
    }
    public void selectLastSession() {
        List<WebElement> lastSessions = driver.findElements(By.xpath("//div[contains(@class,'ui-tabs-panel')][@aria-expanded='true']/div/div[@aria-hidden = 'false'][last()]/a"));
        lastSessions.get(lastSessions.size() - 1).click();
    }
}
