package Steps;

import Pages.Dashboard;
import io.qameta.allure.Step;


public class DashboardSteps {
    Dashboard dashboard = new Dashboard();
    @Step
    public DashboardSteps clickOnForms(){
        dashboard.form.click();
        return this;
    }
    @Step
    public  DashboardSteps clickOnPracticeForms (){
        dashboard.practice.click();
        return  this;
    }
}
