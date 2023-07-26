package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScrollToCavea {
    private WebDriver driver;
    @FindBy(xpath = "//ul[contains(@class,'cinema-tabs')]//a[text()= 'კავეა ისთ ფოინთი']")
    private WebElement caveaLink;

    public ScrollToCavea(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getCaveaLink() {
        return caveaLink;
    }
}
