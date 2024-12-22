package uiappfeature;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions   // This class is only for running the failed Scenarios 
		(
		
		features= {"@target/failedrun.txt"},// if you give the path of folder then you have start with @ & then folder name/filename 
		glue= {"uiappfeature"},
		plugin= {"pretty", "html:target/amazontestreport/report.html",
				"rerun:target/failedrun.txt"
				
				},
		publish=true 
		
		
		)






public class AmazonFailedTestRunner extends AbstractTestNGCucumberTests {

}
