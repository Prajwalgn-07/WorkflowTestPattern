package workFlow.definitions;


import com.testvagrant.ekam.commons.LayoutInitiator;
import com.testvagrant.ekam.commons.workflows.FulfillCondition;
import data.models.UserDetails;
import pages.LoginPage;
import workFlowPattern.UseCase;
import workFlowPattern.WorkFlowDefinition;


public class LoginDefinition extends WorkFlowDefinition {

    protected FulfillCondition<LoginDefinition> login=
            ()->{
        create().login(useCase.getData(UserDetails.class),LoginPage.class);
        return this;
            };

    public LoginDefinition(UseCase useCase) {
        super(useCase);
    }

    @Override
    public LoginPage create() {
        return LayoutInitiator.Page(LoginPage.class);
    }

    @Override
    public InformationDefinition next() {
        return proceedToNext(login,new InformationDefinition(useCase));
    }
}
