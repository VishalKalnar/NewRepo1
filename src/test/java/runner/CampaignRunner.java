package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src\\test\\resources\\appfeatures\\Campaign.feature"},
		glue= {"stepDefinitions",
				"hooks"
				},
		plugin= {"pretty"},
//		dryRun=true,
		
//		tags="not (@functional and @sanity) "
		tags="@campaigns"
//		tags="@sanity and @functional"
//		tags =  "not @functional"
		
		)





public class CampaignRunner extends AbstractTestNGCucumberTests {

}
