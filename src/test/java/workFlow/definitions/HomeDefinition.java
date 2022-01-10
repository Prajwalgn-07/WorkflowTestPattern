package workFlow.definitions;

import com.testvagrant.ekam.commons.LayoutInitiator;
import com.testvagrant.ekam.commons.workflows.FulfillCondition;
import data.clients.ProductDetails;
import data.models.Product;
import pages.HomePage;
import workFlowPattern.UseCase;
import workFlowPattern.WorkFlowDefinition;


public class HomeDefinition extends WorkFlowDefinition {
    protected FulfillCondition<HomeDefinition> selectProduct=
            ()->{
        create().selectProduct(useCase.getData(Product.class).getName());
        return this;
            };

    public HomeDefinition(UseCase useCase) {
        super(useCase);
    }

    @Override
    public HomePage create() {
        return LayoutInitiator.Page(HomePage.class);
    }

    @Override
    public ProductDefinition next() {
        return proceedToNext(selectProduct,new ProductDefinition(useCase));
    }
}
