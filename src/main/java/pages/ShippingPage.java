package pages;

import com.testvagrant.ekam.reports.annotations.WebStep;
import com.testvagrant.ekam.atoms.web.WebPage;
import org.openqa.selenium.By;

public class ShippingPage extends WebPage {
    private By continueToPayment = query("//button[@id='continue_button']");


    @WebStep(keyword = "When", description = "I hit continue to payment button")
    public ShippingPage navigateToPaymentPage() {
            element(continueToPayment).click();
        return this;
    }

}