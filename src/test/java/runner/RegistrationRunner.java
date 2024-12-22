package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= {"src\\test\\resources\\appfeatures\\Ragistration.feature"},
		glue= {"stepDefinitions"},
		plugin= {"pretty"}
		
		)
public class RegistrationRunner extends AbstractTestNGCucumberTests {

}
