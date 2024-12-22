package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithDataSteps {
	
	@Given("user should be at loginpage")
	public void user_should_be_at_loginpage() 
	{
	     System.out.println("Navigate to login page");
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String uname) 
	{
		     System.out.println("Entering username as "+uname);
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String pwd)
	{
	     System.out.println("Entering the pass as "+pwd);
	}

	@When("user click on submit button {int}")
	public void user_click_on_submit_button(Integer int1)
	{
	    System.out.println("Clicked on button with number "+int1);
	}

	@Then("user should get logged into application")
	public void user_should_get_logged_into_application() 
	{
	     System.out.println("Login validated");
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
