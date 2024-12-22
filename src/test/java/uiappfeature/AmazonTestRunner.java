package uiappfeature;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= {"src\\test\\resources\\uiappfeature"},
		glue= {"uiappfeature"},
		plugin= {"pretty", "html:target/amazontestreport/report.html",
				"rerun:target/failedrun.txt"
				},
		publish=true   // to generate a report in browser 
//	tags="@functional"  // to execute particular scenarios 
		
		
		
		)


public class AmazonTestRunner extends  AbstractTestNGCucumberTests {
	
	// for parellel Execution purpose this code 
	
	
//	@Override
//	@DataProvider(parallel=true)
//	public Object [][] scenarios()
//	{
//		return super.scenarios();
//	}
	

}
