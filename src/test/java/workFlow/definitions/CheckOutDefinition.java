package workFlow.definitions;

import com.testvagrant.ekam.commons.LayoutInitiator;
import com.testvagrant.ekam.commons.workflows.FulfillCondition;
import pages.CheckOutPage;
import workFlowPattern.UseCase;
import workFlowPattern.WorkFlowDefinition;


public class CheckOutDefinition extends WorkFlowDefinition {
    protected FulfillCondition<CheckOutDefinition> checkOut=
            ()->{
        create().navigateToCheckOut();
        return this;
            };
    public CheckOutDefinition(UseCase useCase) {
        super(useCase);
    }

    @Override
    public CheckOutPage create() {
        return LayoutInitiator.Page(CheckOutPage.class);
    }

    @Override
    public LoginDefinition next() {
        return proceedToNext(checkOut,new LoginDefinition(useCase));
    }
}
