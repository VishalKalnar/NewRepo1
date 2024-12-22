package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
		(

features= {"src\\test\\resources\\appfeatures\\Profile.feature"},

glue= {"stepDefinitions",
//		"hooks"
		},

plugin= {"pretty"}


		)


public class ProfileRunner extends AbstractTestNGCucumberTests {

}
