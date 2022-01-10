package pages;

import com.testvagrant.ekam.atoms.web.WebPage;
import com.testvagrant.ekam.reports.annotations.WebStep;
import data.models.UserDetails;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.testvagrant.ekam.commons.LayoutInitiator.Page;

public class LoginPage extends WebPage {
    private By emailId = queryByName("customer[email]");
    private By password = queryByName("customer[password]");
    private By signIn = query("//*[@id=\"customer_login\"]/button");
    private By loginHeading = query("//h1[@id='login']");



    @WebStep(keyword = "When", description = "I Login")
    public  <T extends WebPage>T login(UserDetails userDetails,Class<T>tClass) {
        fillEmailId(userDetails.getEmail());
        fillPassword(userDetails.getPassword());
        clickOnSignInButton();
        return Page(tClass);
    }


    @WebStep(keyword = "When", description = "I fill emailId")
    protected LoginPage fillEmailId(String emailId) {
        element(this.emailId).click();
        textbox(this.emailId).setText(emailId);
        return this;
    }

    @WebStep(keyword = "When", description = "I fill password")
    protected LoginPage fillPassword(String password) {
        element(this.password).click();
        textbox(this.password).setText(password);
        return this;
    }


    @WebStep(keyword = "When", description = "I click on login Button")
    public LoginPage clickOnSignInButton() {
        element(this.signIn).click();
        new WebDriverWait(driver,10)
                .until(ExpectedConditions.titleIs("Information - ul-web-playground - Checkout"));
        return this;
    }

    @WebStep(keyword = "When", description = "I return the Login heading")
    public String getHeading() {
        return element(loginHeading).getTextValue();
    }


}