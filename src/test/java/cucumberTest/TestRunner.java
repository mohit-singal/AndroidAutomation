package cucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author msingal
 * Cucumber test runner class having path to feature and step definition file.
 */
@RunWith(Cucumber.class)
@CucumberOptions(strict= false,
		features = "src/test/resources/Feature/eBay.feature",
		tags= {"@RegressionSuite"},glue={"stepDefinition"}, format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"}
		
		)
public class TestRunner {

}
