package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		
		features= {"src\\test\\resources\\appfeatures\\LoginWithData.feature"},
		
		glue= {"stepDefinitions"},
		
		plugin= {"pretty"} 
		)
public class LoginWithDataRunner extends AbstractTestNGCucumberTests {

	
}
