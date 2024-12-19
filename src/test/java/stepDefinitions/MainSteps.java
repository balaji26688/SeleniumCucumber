package stepDefinitions;

import org.testng.annotations.BeforeMethod;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	
	@Given("user is on netbanking login page")
	public void user_is_on_netbanking_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user is on netbanking login page");
	}
	@BeforeMethod
	@When("user is login into application")
	public void user_is_login_into_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is login into application");
	}
	@Then("home page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("home page is displayed");
	}
	
	@Then("cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("cards are displayed");
	}

	@Given("sec user is on netbanking login page")
	public void sec_user_is_on_netbanking_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("sec user is on netbanking login page");
	}
@When("user is log into Application")
public void user_is_log_into_application() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("sec admin is log into application");
}
@Then("Homepage is displayed")
public void homepage_is_displayed() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("sec admin cards are displayed");
}
@Given("use1r is on smartcare page")
public void use1r_is_on_smartcare_page() {
    // Write code here that turns the phrase above into concrete actions
System.out.println("use1r is on smartcare page");
}

@When("user is enters the wrong credentials1")
public void user_is_enters_the_wrong_credentials1() {
    // Write code here that turns the phrase above into concrete actions
System.out.println("user is enters the wrong credentials1");
}

@Then("Popup will come with like  user not exits1")
public void popup_will_come_with_like_user_not_exits1() {
    // Write code here that turns the phrase above into concrete actions
   System.out.println("Popup will come with like  user not exits1");
}


}
