package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/features/" }, monochrome = true, glue = { "StepDefinitions",
		"AppsHooks" }, plugin = { "pretty", "html:target/cucumber.html", "json:target/cucumber.json",
				"usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml" })

// "com.avenstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })
//, "com.aventsatck.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
public class MyTestRunner {

}
