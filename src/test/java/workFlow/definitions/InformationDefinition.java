package workFlow.definitions;

import com.testvagrant.ekam.commons.LayoutInitiator;
import com.testvagrant.ekam.commons.workflows.FulfillCondition;
import data.models.UserDetails;
import pages.InformationPage;
import workFlowPattern.UseCase;
import workFlowPattern.WorkFlowDefinition;


public class InformationDefinition extends WorkFlowDefinition {
    protected FulfillCondition<InformationDefinition> fillDetails=
            ()->{
        create().enterAddress(useCase.getData(UserDetails.class));
        return this;
            };
    public InformationDefinition(UseCase useCase) {
        super(useCase);
    }

    @Override
    public InformationPage create() {
        return LayoutInitiator.Page(InformationPage.class);
    }

    @Override
    public ShippingDefinition next() {
        return proceedToNext(fillDetails,new ShippingDefinition(useCase));
    }
}
