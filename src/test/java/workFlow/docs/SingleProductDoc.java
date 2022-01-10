package workFlow.docs;

import workFlow.definitions.*;
import workFlowPattern.UseCase;
import workFlowPattern.WorkFlowDoc;


public class SingleProductDoc extends WorkFlowDoc {

    public SingleProductDoc(UseCase useCase) {
        super(useCase);
    }
    public HomeDefinition selectProduct(){
        return new HomeDefinition(useCase);
    }
    public ProductDefinition product(){
        return selectProduct().next();
    }
    public CheckOutDefinition cart(){
        return product().next();
    }
    public LoginDefinition checkOut() {
        return cart().next();
    }
    public InformationDefinition login(){
        return checkOut().next();
    }
    public ShippingDefinition contact(){
        return login().next();
    }
    public PaymentDefinition payment(){
        return  contact().next();
    }
}
