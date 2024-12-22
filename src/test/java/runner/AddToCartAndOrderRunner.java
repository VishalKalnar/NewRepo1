package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src\\test\\resources\\appfeatures\\PlaceOrder.feature"},
		glue= {"stepDefinitions"},
		plugin= {"pretty"},
		dryRun=false,
		publish=true          // in that example we use pico-conntainer library
		
		
		)

public class AddToCartAndOrderRunner extends AbstractTestNGCucumberTests {

}
