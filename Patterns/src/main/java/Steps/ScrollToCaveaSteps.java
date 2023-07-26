package Steps;

import Pages.ScrollToCavea;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollToCaveaSteps {
    private WebDriver driver;
    private ScrollToCavea scrollToCavea;

    public ScrollToCaveaSteps(WebDriver driver){
        this.driver = driver;
        scrollToCavea = new ScrollToCavea(driver);
    }
    public void scrollToCaveaAndClick() {
        WebElement caveaLink = scrollToCavea.getCaveaLink();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(); window.scrollBy(0,-100);", caveaLink);
        caveaLink.click();
    }
}
