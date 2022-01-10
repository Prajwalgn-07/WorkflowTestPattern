package pages;

import com.testvagrant.ekam.reports.annotations.WebStep;
import com.testvagrant.ekam.atoms.web.WebPage;
import org.openqa.selenium.By;

public class PaymentPage extends WebPage {
    private By cod = queryById("checkout_payment_gateway_75842814173");
    private By completeOrder = query("//*[@id=\"continue_button\"]");
    private By heading = query("//h2[@id='main-header']");


    @WebStep(keyword = "When", description = "I check cash on delivery box")
    public PaymentPage selectCod() {
        element(cod).click();
        return this;
    }
    @WebStep(keyword = "When", description = "I hit complete order button")
    public PaymentPage completeOrder() {
        element(completeOrder).click();
        return this;
    }

    @WebStep(keyword = "When", description = "I return the title")
    public String getTitle() {
        return driver.getTitle();
    }

    @WebStep(keyword = "When", description = "I return the heading")
    public String getHeading() {
        return element(heading).getTextValue();
    }

}