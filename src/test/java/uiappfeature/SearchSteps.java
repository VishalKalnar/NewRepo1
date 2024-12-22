package uiappfeature;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchPage;
import qa.DriverFactory;

public class SearchSteps {
	SearchPage search=new SearchPage(DriverFactory.getDriver());
	@When("I search the item as {string} in search field")
	public void i_search_the_item_as_in_search_field(String string) {
	    search.searchProduct(string);
	    search.searchbutn();
	}

	@Then("I should see search results")
	public void i_should_see_search_results() {
	    
		boolean isVisible = search.verifyBrand();
		Assert.assertEquals(isVisible, true);
	}
	









}