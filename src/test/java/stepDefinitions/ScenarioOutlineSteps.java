package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {
	
	@Given("usere is at signup page")
	public void usere_is_at_signup_page() 
	{
	      System.out.println("Signing up....");
	}

	@When("user enters the  name as {string} on form")
	public void user_enters_the_name_as_on_form(String string)
	{
	    System.out.println("Entered Name is "+string); 
	}

	@When("user select the slot no as {int}")
	public void user_select_the_slot_no_as(Integer int1) 
	{
	     System.out.println("Selected slot is "+int1);
	}

	@When("user select gender as {string}")
	public void user_select_gender_as(String string) 
	{
	   System.out.println("Select gender value is "+string); 
	}

	@Then("user gets created")
	public void user_gets_created() 
	{
		System.out.println("User created");      
	}



	
	
	
	
	
	
	
	
	
	
	
	
	

}
