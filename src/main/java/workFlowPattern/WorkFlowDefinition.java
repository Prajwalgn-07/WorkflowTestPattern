package workFlowPattern;

import com.testvagrant.ekam.commons.workflows.FulfillCondition;
import com.testvagrant.ekam.commons.workflows.Workflow;

public abstract class WorkFlowDefinition implements Workflow {
    protected workFlowPattern.UseCase useCase;

    public WorkFlowDefinition() {
        this.useCase = workFlowPattern.UseCase.builder().build();
    }

    public WorkFlowDefinition(UseCase useCase) {
        this.useCase=useCase;
    }

    protected <Current, Next> Next proceedToNext(
            FulfillCondition<Current> fulfillCondition, Next whereTo) {
        if (!useCase.isACompletedState(this)) {
            fulfillCondition.apply();
            useCase.persistState(this);
        }
        return whereTo;
    }
}
