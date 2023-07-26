package steps1;

import org.openqa.selenium.WebDriver;
import pages1.popup;

public class popupsteps {
    private WebDriver driver;
    private popup seatSelectionPopup;

    public popupsteps(WebDriver driver) {
        this.driver = driver;
        seatSelectionPopup = new popup(driver);
    }

    public void selectRandomSeat() {
        seatSelectionPopup.selectRandomSeat();
    }
}
