package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Dashboard {
    public SelenideElement form = $$(By.xpath("//div[@class = \"card mt-4 top-card\"]")).get(1);
    public SelenideElement practice = $(By.xpath("//*[text()= 'Practice Form']"));

}