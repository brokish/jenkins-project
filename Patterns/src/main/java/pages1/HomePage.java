package pages1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateTo() {
        driver.get("https://www.swoop.ge/");
    }

    public void clickMoviesLink() {
        driver.findElement(By.linkText("კინო")).click();
    }
}


