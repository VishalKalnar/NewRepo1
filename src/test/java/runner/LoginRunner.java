package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
		(
		
features= {"src\\test\\resources\\appfeatures\\Login.feature"}	,


glue= {"stepDefinitions"}
		
		
		)


public class LoginRunner extends AbstractTestNGCucumberTests {

}
