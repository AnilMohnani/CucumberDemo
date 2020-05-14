package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = { "stepDefinitions" }, plugin = { "html:test-output",
		"json:json_output/cucumber.json", "junit:junit_file/cucumber.xml" }, monochrome = true,strict=true,dryRun=false)

public class RunnerTest {

}