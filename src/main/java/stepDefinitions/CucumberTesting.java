package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberTesting {

	@Given("^Print one statement$")
	public void print_one_statement() throws Throwable {
	System.out.println("Hello everyone");  
	}

	@When("^Statement printed pass parameter1 \"([^\"]*)\"$")
	public void statement_printed_pass_parameter(String arg2) throws Throwable {
	System.out.println("The passed parameter is ---"+arg2);
//	throw new PendingException();
	}

	@Then("^logout$")
	public void logout() throws Throwable {
	System.out.println("Finish and logout");
	}
}
