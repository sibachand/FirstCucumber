package cucumber_Scripts;

import org.junit.After;
import org.junit.Before;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition {
	@Before
	public void BeforeScenario() {
		System.out.println("This will execute before all scenarios");
	}

	@After
	public void AfterScenario() {
		System.out.println("This will execute after all scenarios");
	}

@Given("^this is first step$")
public void this_is_first_step() throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@When("^this is the second step$")
public void this_is_the_second_step() throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@Then("^this is the third step$")
public void this_is_the_third_step() throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

//	
//	@Given("^this is first step$")
//	public void this_is_first_step() throws Throwable {
//	    // Express the Regexp above with the code you wish you had
//		System.out.println("This is the First Step");
//	    throw new PendingException();
//	}
//
//	@When("^this is the second step$")
//	public void this_is_the_second_step() throws Throwable {
//	    // Express the Regexp above with the code you wish you had
//		System.out.println("This is the Second Step");
//		throw new PendingException();
//	}
//
//	@Then("^this is the third step$")
//	public void this_is_the_third_step() throws Throwable {
//	    // Express the Regexp above with the code you wish you had
//		System.out.println("This is the Third Step");
//		throw new PendingException();
//	}
//	
//	/*@Given("^this is first step$")
//	public void this_is_first_step(){
//		System.out.println("This is the First Step");
//	}
//	
//	@When("^this is the second step$")
//	public void this_is_the_second_step(){
//		System.out.println("This is the Second Step");
//	}
//	
//	@Then("^this is the third step$")
//	public void this_is_the_third_step(){
//		System.out.print("This is the Third Step");
//	}*/
}
