package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrdersSteps {

	@Given("user should be logged in")
	public void user_should_be_logged_in() 
	{
	    System.out.println("Given statement");
	}

	@When("user click on orders button")
	public void user_click_on_orders_button()
	{
		System.out.println("click on orders ");
	}

	@Then("user redirects to order page")
	public void user_redirects_to_order_page()
	{
	    System.out.println("redirect to orders");
	}

	@When("user click on current order")
	public void user_click_on_current_order() 
	{
	    System.out.println("Click on current order");
	}

	@Then("user should see current order information")
	public void user_should_see_current_order_information() 
	{
		System.out.println("Current order information fetched");
	}

	@When("user click on cancel order")
	public void user_click_on_cancel_order()
	{
		System.out.println("Navigating to cancelled order");
	}

	@Then("user should see cancelled order information")
	public void user_should_see_cancelled_order_information() 
	{
		System.out.println("Cancelled order information fetched");
	}


	
	
	
	
	
	
	
	
	
	
}
