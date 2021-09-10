package MyRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="src/test/java/Features",
		glue="stepDefinitions",
		plugin= {"pretty","html:HTML-Reports"}
//		monochrome=true
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}