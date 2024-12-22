package uiappfeature;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import qa.DriverFactory;

public class HomepageSteps {
	
	HomePage homePage=new HomePage( DriverFactory.getDriver());
	
	
	@Given("I am at landing page")
	public void i_am_at_landing_page() {
		WebDriver driver= DriverFactory.getDriver();
		driver.get("https://www.amazon.in/");
		
	}

	@Then("page title should contains {string}")
	public void page_title_should_contains(String string) {
		
		String title =homePage.fetchTitle();
		
		boolean isPresent = title.contains(string);
		System.out.println("title is matching");
		Assert.assertEquals(isPresent, true);
				
	}

	@Then("cart icon should get displayed")
	public void cart_icon_should_get_displayed() {
		
		boolean isDisplaying = homePage.verifycartIcon();
		Assert.assertEquals(isDisplaying, true);
		System.out.println("cart icon verified");
	 
	}

	@When("I click on mobile deals")
	public void i_click_on_mobile_deals() {
		homePage.enteringDealsSection();
		System.out.println("clicked on deals");
		
	}

	@Then("mobile deals section should open")
	public void mobile_deals_section_should_open() {
		boolean isDisplaying = homePage.identifyToysTextSection();
		Assert.assertEquals(isDisplaying, true);
		System.out.println("okk");
	}


	
	
	
	
	
	
	
	
	
	}
