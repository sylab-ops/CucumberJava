package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepsParams {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step - user is on login page");
	}
	
	@Given("user enters user1 and pass1")
	public void user_enters_user1_and_pass1() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step - user enters user1 and pass1");
	}
	
	@And("user click on login button")
	public void user_click_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		System.out.println("Inside Step - user click on login button");
	}

	@Then("user is re-directed to home page")
	public void user_is_re_directed_to_home_page() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		System.out.println("Inside Step - user is re-directed to home page");
	}
	
	@Given("user enters user2 and pass2")
	public void user_enters_user2_and_pass2() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step - user_enters_user2_and_pass2");
	}
	

}
