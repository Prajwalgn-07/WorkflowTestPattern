package pages;

import com.testvagrant.ekam.reports.annotations.WebStep;
import com.testvagrant.ekam.atoms.web.WebPage;
import org.openqa.selenium.By;

public class CheckOutPage extends WebPage {
    private By checkOut = query("//button[@id='checkout']");

    @WebStep(keyword = "When", description = "I hit search button")
    public CheckOutPage navigateToCheckOut() {
        element(checkOut).click();
        return this;
    }

}