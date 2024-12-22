package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddingProductToCartSteps {  // in that example we use pico-conntainer library

	String productId;
	
	public String getProductId()      // place order feature file we use here 
	{
		return productId;
		
	}
	
	
	@Given("I should at the product page")
	public void i_should_at_the_product_page() {
	    System.out.println("Given statement");
	}

	@When("I click on add to cart button")
	public void i_click_on_add_to_cart_button() {
	   System.out.println("Product added to cart");
	   
	}

	@Then("Product should get add to cart")
	public void product_should_get_add_to_cart() {
	   System.out.println("Product Validated");
	   
	    productId="vjsgduy2555nshb";
	}

	



}
