package stepDefinitions;

import org.testng.annotations.AfterMethod;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Dashboard {
	
	
	@When("user is given correct username and password")
	public void user_is_given_correct_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	System.out.println("dashboard user is given correct username and password");
	}
	@Then("user is successfully loggen into home page")
	public void user_is_successfully_loggen_into_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("dashboard user is successfully loggen into home page");

	}
	@Then("Home page is showing like welcome to netbanking")
	public void home_page_is_showing_like_welcome_to_netbanking() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("dashboard Home page is showing like welcome to netbanking");

	}

	
	
	//=====================
	
	@Given("user is on smartcare page")
	public void user_is_on_smartcare_page()
	{
		System.out.println("user is on smartcare page");
	}
	
	@When("user is enters the wrong credentials")
	public void user_is_enters_the_wrong_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user enters with wrong credentials");
	}
	@Then("Popup will come with like  user not exits")
	public void popup_will_come_with_like_user_not_exits() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Popup will come with like  user not exits");

	}


	
	@Given("user is clicked close button successfully")
	public void clicked_close_button() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user is clicked close button successfully");

	}
	@AfterMethod
	@Then("Application successfully logged out")
	public void closed_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Application logged out successfully");
	    


	}
	
	
}
