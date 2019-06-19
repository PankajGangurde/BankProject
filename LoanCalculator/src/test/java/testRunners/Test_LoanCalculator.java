package testRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {  "pretty", "html:target/Destination",
					"json:target/Destination/cucumber.json",
					"junit:target/Destination/cucumber.xml"  },
		features={"src/main/resources/features"},
		glue={"stepDefinitions"}
)

public class Test_LoanCalculator {

}
