package core.cucumber;


import cucumber.runtime.PendingException;

import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When; 
public class test {

	@Given("^today is Sunday$")
	public void today_is_Sunday() {
	    // Express the Regexp above with the code you wish you had
	    System.out.println();
	}


@Given("^today is \"([^\"]*)\"$")
public void today_is(String arg1) {
    // Express the Regexp above with the code you wish you had
System.out.println();
}

@When("^I ask whether it's Friday yet$")
public void I_ask_whether_it_s_Friday_yet() {
    // Express the Regexp above with the code you wish you had
  System.out.println();
}

	@Then("^I should be told \"([^\"]*)\"$")
	public void I_should_be_told(String arg1) {
	    // Express the Regexp above with the code you wish you had
		System.out.println("############printing"+arg1);
	}

}
