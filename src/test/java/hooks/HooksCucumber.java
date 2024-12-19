package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class HooksCucumber {
	
	@Before
	@Given("database properties file")
	public void database_successfully_connected() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("database successfully connected");
	}

	
    @After
	@Given("find the connections")
	public void close_all_the_connections() {
	    // Write code here that turns the phrase above into concrete actions
     System.out.println("all connections are closed");	}



}
