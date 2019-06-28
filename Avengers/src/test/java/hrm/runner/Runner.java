package hrm.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		
		features= {"menubuttontest.feature"},
		glue="hrm.stepdef",
		tags="@functionalTest"
		
		
		
		)


public class Runner extends AbstractTestNGCucumberTests{

}
