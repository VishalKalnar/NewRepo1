package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrederConfirmationSteps {    // in that example we use pico-conntainer library
	
	AddingProductToCartSteps addingProduct;
	
	public OrederConfirmationSteps(AddingProductToCartSteps aps) 
	{
		addingProduct = aps;
	}
	
	
	@When("I clicked on place order")    // place order feature file we use here 
	public void i_clicked_on_place_order() {
		System.out.println("Placing the Order");
	    
	}

	@Then("order should get placed")
	public void order_should_get_placed() {
		System.out.println("Order placed validated");
	   
		String prdId=addingProduct.getProductId();
		
		System.out.println(prdId);
		
	}
}
