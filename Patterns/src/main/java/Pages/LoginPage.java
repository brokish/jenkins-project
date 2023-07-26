package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public SelenideElement studentNameResult = getResultByName("Student Name");
    public SelenideElement  mobileNumberResult = getResultByName("Mobile");
    public  SelenideElement firstName = $(By.id("firstName"));
    public  SelenideElement lastName = $(By.id("lastName"));
    public SelenideElement userNumber = $(By.id("userNumber"));
    public SelenideElement getGender (String gender)  {
        return $(By.xpath(" //label[text() = '"+ gender + "']"));

    }
    public SelenideElement SubmitButton = $(By.id("submit"));
    public SelenideElement Header = $("#example-modal-sizes-title-lg");
    public SelenideElement getResultByName(String name){
        return $(By.xpath("//td[text()='"+ name + "']/following-sibling::td"));
    }
}

