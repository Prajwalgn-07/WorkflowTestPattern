package pages;

import com.testvagrant.ekam.reports.annotations.WebStep;
import com.testvagrant.ekam.atoms.web.WebPage;
import data.models.UserDetails;
import org.openqa.selenium.By;

public class InformationPage extends WebPage {
    private By addressLine1 = queryById("checkout_shipping_address_address1");
    private By addressLine2 = queryById("checkout_shipping_address_address2");
    private By addressCity = queryById("checkout_shipping_address_city");
    private By addressState = queryById("checkout_shipping_address_province");
    private By addressPinCode = queryById("checkout_shipping_address_zip");
    private By continueToShippingButton = queryById("continue_button");
    private By heading = query("//h2[@id='main-header']");


    @WebStep(keyword = "When", description = "I search for query")
    public InformationPage enterAddress(UserDetails userDetails) {
        enterAddressLine1(userDetails.getAddressLine1())
                .enterAddressLine2(userDetails.getAddressLine2())
                .enterAddressCity(userDetails.getCity())
                .selectAddressState(userDetails.getState())
                .enterAddressPinCode(userDetails.getPinCode());
        return this;
    }

    @WebStep(keyword = "When", description = "I enter addressLine1")
    private InformationPage enterAddressLine1(String address1) {
        textbox(addressLine1).clear();
        textbox(addressLine1).setText(address1);
        return this;
    }
    @WebStep(keyword = "When", description = "I enter addressLine2")
    private InformationPage enterAddressLine2(String address2) {
        textbox(addressLine2).clear();
        textbox(addressLine2).setText(address2);
        return this;
    }
    @WebStep(keyword = "When", description = "I enter city")
    private InformationPage enterAddressCity(String city) {
        textbox(addressCity).clear();
        textbox(addressCity).setText(city);
        return this;
    }
    @WebStep(keyword = "When", description = "I select state")
    private InformationPage selectAddressState(String state) {
        dropdown(addressState).selectOption(state);
        return this;
    }
    @WebStep(keyword = "When", description = "I enter zip code")
    private InformationPage enterAddressPinCode(String zipCode) {
        textbox(addressPinCode).clear();
        textbox(addressPinCode).setText(zipCode);
        return this;
    }
    @WebStep(keyword = "When", description = "I hit continue to shipping button")
    public InformationPage navigateToShippingPage() {
        element(continueToShippingButton).click();
        return this;
    }

    @WebStep(keyword = "When", description = "I return the heading")
    public String getHeading() {
        return element(heading).getTextValue();
    }

}