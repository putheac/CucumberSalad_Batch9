package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json", "junit:target/cucumber-reports/Cucumber.xml",
				"html:target/cucumber-reports/index.html" }, 
		monochrome = true, 
		features = "src/test/resources/features/", 
		glue = "stepDef", 
		dryRun = true, 
		tags = "@sprint33Tom"

)

public class sprint33CuckesRunner {

}
