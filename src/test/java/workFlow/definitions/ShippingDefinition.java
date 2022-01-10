package workFlow.definitions;

import com.testvagrant.ekam.commons.LayoutInitiator;
import com.testvagrant.ekam.commons.workflows.FulfillCondition;
import pages.ShippingPage;
import workFlowPattern.UseCase;
import workFlowPattern.WorkFlowDefinition;

public class ShippingDefinition extends WorkFlowDefinition {
    protected FulfillCondition<ShippingDefinition>payment=
            ()->{
        create().navigateToPaymentPage();
        return this;
            };
    public ShippingDefinition (UseCase useCase) {
        super(useCase);
    }

    @Override
    public ShippingPage create() {
        return LayoutInitiator.Page(ShippingPage.class);
    }

    @Override
    public PaymentDefinition next() {
        return proceedToNext(payment,new PaymentDefinition(useCase));
    }
}
