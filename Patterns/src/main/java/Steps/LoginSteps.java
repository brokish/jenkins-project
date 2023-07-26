package Steps;

import Data.LoginData;
import Pages.LoginPage;
import io.qameta.allure.Step;


import static com.codeborne.selenide.Selenide.zoom;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();
    LoginData loginData = new LoginData();

    @Step
    public LoginSteps setUserName() {
        loginPage.firstName.setValue(loginData.name);
        return this;
    }

    @Step
    public LoginSteps setName() {
        loginPage.lastName.setValue(loginData.lastName);
        return this;
    }

    @Step
    public LoginSteps setNumber() {
        loginPage.userNumber.setValue(loginData.userNumber);
        return this;
    }

    @Step
    public LoginSteps setGender() {
        loginPage.getGender(loginData.gender).click();
        return this;
    }

    @Step
    public LoginSteps submitButton() {
        loginPage.SubmitButton.click();
        return this;

    }
    @Step

    public LoginSteps zoomed() {
        zoom(1);
        return this;
    }
}
