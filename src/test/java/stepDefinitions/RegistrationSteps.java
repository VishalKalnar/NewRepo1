package stepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps {
	
	
	@Given("user is at accounts page")
	public void user_is_at_accounts_page()
	{
	    System.out.println("Given for account opening");
	}

	@When("user enters the following data")
	public void user_enters_the_following_data(DataTable dataTable)
	{
//	     System.out.println(dataTable);
		
//		reading the data as list
		 List<List<String>> data =dataTable.asLists();
		
		 List<String> data1 = data.get(0);
		 System.out.println(data1);
		
		 for (String element:data1) {
			 System.out.println(element);
		 }
		String lastname=data1.get(1);
		System.out.println(lastname);
		
		String phonenumber=data.get(1).get(3);
		System.out.println(phonenumber);
		
		String email=data.get(2).get(2);
		System.out.println(email);
		
		System.out.println("**********************************************************");
		
		List<Map<String,String>> mapData=dataTable.asMaps();
		
//		System.out.println(mapData);
		
		Map<String,String>mapData1=mapData.get(1);
//		System.out.println(mapData1);
		
		String emalvalue=mapData1.get("email");
		System.out.println(emalvalue);
		
		
		
		String emailOfZerothIndex = mapData.get(0).get("email");
		
		System.out.println(emailOfZerothIndex);

		
		
		
		
		
		
		
	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button()
	{
	     System.out.println("Submitting the details");
	}

	@Then("application should get submitted")
	public void application_should_get_submitted() 
	{
	     System.out.println("Application submitted");
	}



	
	
	
	
	
	
	
	

}
