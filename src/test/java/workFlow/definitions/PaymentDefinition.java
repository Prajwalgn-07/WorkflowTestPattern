package workFlow.definitions;

import com.testvagrant.ekam.commons.LayoutInitiator;
import com.testvagrant.ekam.commons.workflows.FulfillCondition;
import pages.PaymentPage;
import workFlowPattern.UseCase;
import workFlowPattern.WorkFlowDefinition;

public class PaymentDefinition extends WorkFlowDefinition {
    protected FulfillCondition<PaymentDefinition>selectCod=
            ()->{
        create().selectCod();
        return this;
            };
    public PaymentDefinition (UseCase useCase) {
        super(useCase);
    }

    @Override
    public PaymentPage create() {
        return LayoutInitiator.Page(PaymentPage.class);
    }

    @Override
    public PaymentDefinition next() {
        return this;
    }
}
