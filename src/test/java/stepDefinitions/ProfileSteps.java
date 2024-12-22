package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSteps {
	@Given("I have logged into the application")
	public void loggedIntoApp() 
	{
		System.out.println("logged into application");
	}
	
	@Given("I am at home page")
	public void navToHomePage()
	{
		System.out.println("navigated to home page");
	}
	
	@When("I click on add button")
	public void addProfile() 
	{
		System.out.println("addition of profile");
	}

	@When("I enter the data")
	public void enteringData()
	{
		System.out.println("data added");
	}
	
	@Then("profile should get added")
	public void profileValidated() 
	{
		System.out.println("add profile validation");
	}
	
	@When("I click on edit button")
	public void editProfile() 
	{
		System.out.println("updation of profile");
	}
	
	@When("I update the data")
	public void updatingData()
	{
		System.out.println("data updated");
	}
	
	@Then("profile should get updated")
	public void profileupdationValidated() 
	{
		System.out.println("update profile validation");
	}
	
	@When("I click on delete button")
	public void hitdeletebutton()
	{
		System.out.println("profile deleted");
	}
	 @Then("profile should get deleted")
	 public void profiledeletionvalidation() 
	 {
		 System.out.println("profile delete validated ");
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
