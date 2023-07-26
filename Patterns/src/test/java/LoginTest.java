import Data.LoginData;
import Pages.LoginPage;
import Steps.DashboardSteps;
import Steps.LoginSteps;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class LoginTest {

    DashboardSteps dashboardSteps = new DashboardSteps();
    LoginSteps loginSteps = new LoginSteps();
    LoginPage loginPage = new LoginPage();
    LoginData loginData = new LoginData();


    @BeforeTest
    public void setup() {
        Configuration.startMaximized = true;
        Configuration.browser = "chrome";
        open("https://demoqa.com/");
    }

    @Test
    public void  Test() {

        dashboardSteps.clickOnForms();
        dashboardSteps.clickOnPracticeForms();

        loginSteps.setUserName()
                .setName()
                .setGender()
                .setNumber();
        loginSteps.zoomed();
        loginSteps.submitButton();

        loginPage.Header.shouldHave(Condition.text("Thanks for submitting the form"));
        loginPage.studentNameResult.shouldHave(Condition.text(loginData.name  +" " + loginData.lastName));
        loginPage.mobileNumberResult.shouldHave(Condition.text(loginData.userNumber));
    }
}
