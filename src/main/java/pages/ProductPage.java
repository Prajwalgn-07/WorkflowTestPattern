package pages;

import com.testvagrant.ekam.reports.annotations.WebStep;
import com.testvagrant.ekam.atoms.web.WebPage;
import org.openqa.selenium.By;

public class ProductPage extends WebPage {
    private By addToCart = query("//*[@class='product-form__submit button button--full-width button--secondary']//span");
    private By checkOut = query("//button[@name='checkout']");
    private By continueShopping = query("button[class='link button-label']");
    private By viewCart = query("//a[@id='cart-notification-button']");

    @WebStep(keyword = "When", description = "I hit add to cart button")
    public ProductPage addToCart() {
        element(addToCart).click();
        return this;
    }
    @WebStep(keyword = "When", description = "I hit the check out button")
    public ProductPage checkOut() {
        element(checkOut).waitUntilDisplayed().click();
        return this;
    }
    @WebStep(keyword = "When", description = "I hit continue shopping button")
    public ProductPage continueShopping() {
        element(continueShopping).waitUntilDisplayed().click();
        return this;
    }

    public ProductPage navigateToCart(){
        element(viewCart).waitUntilDisplayed().click();
        return this;
    }

}