package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src\\test\\resources\\appfeatures\\Orders.feature"},
		glue= {"stepDefinitions","hooks"},
		plugin= {"pretty"},
		
//		dryRun=true // he phakt feature file madhalya steps mapped zalya ka nahi tyasathi asat
		dryRun=false, // bidefault value false aste yane kahi pharak padat nahi
		
		publish=true  // to generate the  report
		)
public class OrdersRunner extends AbstractTestNGCucumberTests 
{
		
}
