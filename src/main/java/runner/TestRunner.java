package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\aathi\\eclipse-workspace\\CricBuzzCucumbebr\\src\\main\\java\\features\\CucumberTesting.feature"}//"C:\\Users\\aathi\\eclipse-workspace\\CricBuzzCucumbebr\\src\\main\\java\\features\\Cricinfo.feature"}//,"C:\\Users\\aathi\\eclipse-workspace\\CricBuzzCucumbebr\\src\\main\\java\\features\\Cricinfo.feature"}//the path of feature file
		,glue = {"stepDefinitions"}//the path of step definition files
		,plugin = {"pretty","html:test-outout"}//,"json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"}//to generate different types of reports
		,monochrome = true//display output in a readable format
//				,tags= {"@Scenario1", "@Scenario2", "~@Scenario3"}
		,dryRun = false//to check mapping between feature file and step definition file
//		,strict = true//to check if any step is not defined in step definition file
		)

public class TestRunner {
	
}
