package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= {"src\\test\\resources\\uiappfeature\\HomePage.feature"},
		glue= {"stepDefinitions","hooks"},
		plugin= {"pretty"},
		dryRun=false
		
		
		)

public class HomePageRunner extends AbstractTestNGCucumberTests {

}
