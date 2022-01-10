package workFlow.definitions;

import com.testvagrant.ekam.commons.LayoutInitiator;
import com.testvagrant.ekam.commons.workflows.FulfillCondition;
import pages.ProductPage;
import workFlowPattern.UseCase;
import workFlowPattern.WorkFlowDefinition;


public class ProductDefinition extends WorkFlowDefinition {
    protected FulfillCondition<ProductDefinition> addToCartAndCheckOut=
            ()->{
        create().addToCart().navigateToCart();
        return this;
            };

    public ProductDefinition(UseCase useCase){
        super(useCase);
    }
    @Override
    public ProductPage create() {
        return LayoutInitiator.Page(ProductPage.class);
    }

    @Override
    public CheckOutDefinition next() {
        return proceedToNext(addToCartAndCheckOut,new CheckOutDefinition(useCase));
    }

}
