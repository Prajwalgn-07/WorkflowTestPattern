# WorkflowTestPattern
- A **Workflow pattern** enables to turn customer journies of the application into reusable workflows
- Page Object Model provides an abstraction for a page (a webpage or mobile screen).The **Workflow pattern** could then be leveraged on top of POM to build workflows that represent a user journey

## Worflow Pattern components
1. **UseCase**: Acts as a data structure to store test data for the current test and the current state of the application. 
            In this we have taken the product details and user details has test data and we have loaded it to [Usecase](src/main/java/workFlowPattern/UseCase.java) using [Usecase generator](src/main/java/data/clients/UseCaseGenerator.java).
            
<img width="290" alt="Screenshot 2022-01-08 at 8 31 26 PM" src="https://user-images.githubusercontent.com/85623711/148649093-e3e3aa47-cfd0-4cad-80a0-a5f88a56ac42.png"> <img width="223" alt="Screenshot 2022-01-08 at 8 31 47 PM" src="https://user-images.githubusercontent.com/85623711/148649069-543b25af-5e92-4ef8-99e4-047178df80e7.png">

2. [**Workflow Definition**](src/test/java/workFlow/definitions/): Define a portion of customer journey, We have written definition for each page starting from selecting a product till payment
- Get the page/screen object for the current work definition by means of **create()** method
- Define the criteria to go to the next workflow definition by means of **fulfillCondition()** - fulfillment criteria is to move to the next page/screen in the workflow / customer journey
- Proceed to the next workflow definition by means of **next()** method - next page/screen in the workflow / customer journey

4. **Workflow Doc**: A workflow doc is the blueprint of your customer journey. It ties workflow definitions to construct end-to-end customer journies.
                 We have written a [SingleProductDoc](src/test/java/workFlow/docs/SingleProductDoc.java), where it has blue print of purchasing a single product
