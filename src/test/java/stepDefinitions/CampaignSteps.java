package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CampaignSteps {
	@Given("user should be at campaigns page")
	public void user_should_be_at_campaigns_page() {

		System.out.println("Navigate to campaign");
	}

	@When("user clicks on create campaign button")
	public void user_clicks_on_create_campaign_button() {
	   System.out.println("clicked on campaign button");
	}

	@When("user enters the information")
	public void user_enters_the_information() {
	    System.out.println("Information entered! ");
	}

	@Then("campaign should get created")
	public void campaign_should_get_created() {
		System.out.println("Campaign created ");
	}

//	@Given("user should be at campaign page")
//	public void user_should_be_at_campaign_page() {
//		System.out.println("clicked on campaign button");
//	}

	@When("user clicks on the edit campaign")
	public void user_clicks_on_the_edit_campaign() {
		System.out.println("Editing the campaign");
	}

	@When("enter the schedule time")
	public void enter_the_schedule_time() {
	   System.out.println("Defining the time for campaign");
	}

	@Then("campaign get scheduled")
	public void campaign_get_scheduled() {
	    System.out.println("campaign Scheduled ");
	}

	@When("user clicks on the sent campaign")
	public void user_clicks_on_the_sent_campaign() {
		System.out.println("Navigate to sent campaign");
	}

	@Then("user should see count of email triggered")
	public void user_should_see_count_of_email_triggered() {
		System.out.println("Validate results");
	}



}
