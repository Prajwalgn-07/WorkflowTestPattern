package workFlowPattern;

import lombok.*;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class UseCase {
    @Builder.Default private Map<Class<?>, Object> useCases = new ConcurrentHashMap<>();
    @Builder.Default private List<Class<?>> completedStates = new CopyOnWriteArrayList<>();

    public UseCase addToUseCase(Object data) {
        useCases.put(data.getClass(), data);
        return this;
    }

    public <Q> Q getData(Class<Q> tClass) {
        return (Q) useCases.get(tClass);
    }

    public WorkFlowDefinition persistState(WorkFlowDefinition currentState) {
        this.completedStates.add(currentState.getClass());
        return currentState;
    }

    public boolean isACompletedState(WorkFlowDefinition workflowDefinition) {
        return completedStates.contains(workflowDefinition.getClass());
    }
}
