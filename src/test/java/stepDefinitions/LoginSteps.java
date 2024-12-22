package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("I am at the login page")
	public void goToLoginPage() {
		System.out.println(" Navigate to login page ");
	}

	@When("I enter the crediantials")
	public void enterCrediantials() {
		System.out.println(" crediantials has been entered  ");
	}

	@When("I click on login button")
	public void clickOnLogin() {
		System.out.println(" clicked on login button");
	}

	@Then("I should be able to login")
	public void Login() {
		System.out.println("login validated ");
	}

//	@Given("I am at the landing page")
//	public void navToLandingPage()
//	{
//		System.out.println("I am on Landing page");
//	}

	@Then("title should get validated")
	public void validateTitle() {
		System.out.println("Title Validated");
	}

}
