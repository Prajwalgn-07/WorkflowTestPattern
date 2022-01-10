package workFlow.tests;

import com.testvagrant.ekam.testBases.testng.WebTest;
import data.clients.UseCaseGenerator;
import org.testng.Assert;
import org.testng.annotations.Test;
import workFlow.docs.SingleProductDoc;

import javax.inject.Inject;

public class PurchaseTests extends WebTest {
    @Inject
    UseCaseGenerator useCaseGenerator;

    @Test(groups = "web")
    public void shouldDisplayLoginPageAfterCheckOut() {
        workFlowPattern.UseCase useCase=useCaseGenerator.happyPathCase();
        Assert.assertEquals("Login",new SingleProductDoc(useCase).checkOut().create().getHeading());
    }

    @Test(groups = "web")
    public void shouldRedirectToInformationPageAfterLogin() {
        workFlowPattern.UseCase useCase=useCaseGenerator.happyPathCase();
        Assert.assertEquals("Contact information",new SingleProductDoc(useCase).login().create().getHeading());
    }

    @Test(groups = "web")
    public void shouldDisplayPaymentPage() {
        workFlowPattern.UseCase useCase=useCaseGenerator.happyPathCase();
        Assert.assertEquals("Payment",new SingleProductDoc(useCase).payment().create().getHeading());
    }
}