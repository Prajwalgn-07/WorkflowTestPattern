package pages;

import com.testvagrant.ekam.reports.annotations.WebStep;
import com.testvagrant.ekam.atoms.web.WebPage;
import org.openqa.selenium.By;

public class HomePage extends WebPage {
    @WebStep(keyword = "When",description = "I select the product")
    public HomePage selectProduct(String productName) {
        String productFormat=String.format("//a[normalize-space()='%s']",productName);
        By productToBuy = query(productFormat);
        element(productToBuy).click();
        return this;
    }
}