package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/resources/features",
	    glue = "stepDefinitions",
	    tags = "@RegistrationTest",
	   plugin = {"pretty", "json:target/cucumber-reports-json/Cucumber.json"} // Generate JSON report
	   // plugin = {"pretty", "html:target/cucumber-reports.html"}
	)
	public class TestRunner extends AbstractTestNGCucumberTests {
	}
