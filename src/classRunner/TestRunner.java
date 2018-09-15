package classRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature/testing.feature"
		, glue = {"stepDefinition"}
		, monochrome = true
		, tags = {"~@Third"}
		)

public class TestRunner {
	
}