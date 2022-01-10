package data.clients;




import javax.inject.Inject;

public class UseCaseGenerator {
    @Inject CustomerDetails customerDetails;
    @Inject ProductDetails productDetails;
    public workFlowPattern.UseCase happyPathCase(){
        return workFlowPattern.UseCase.builder()
                .build()
                .addToUseCase(productDetails.getProductSivaJuliet())
                .addToUseCase(customerDetails.getCustomerWithAccountDetails());
    }
}
