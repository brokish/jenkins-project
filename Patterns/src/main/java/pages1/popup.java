package pages1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class popup {
    private WebDriver driver;

    public popup(WebDriver driver) {
        this.driver = driver;
    }

    public void selectRandomSeat() {
        List<WebElement> seats = driver.findElements(By.cssSelector("div.seat.free"));
        int randomIndex = (int) (Math.random() * seats.size());
        seats.get(randomIndex).click();
    }
}
