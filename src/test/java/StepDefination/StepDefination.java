package StepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefination {

    @Given("^User is on Net Banking landing page$")
    public void user_is_on_net_banking_landing_page() throws Throwable {
        //code
    	System.out.println("landing page");
    }

    @When("^User enters valid username and passsword$")
    public void user_enters_valid_username_and_passsword() throws Throwable {
    	//code
    	System.out.println("username and password");
    	
    }

    @Then("^Homepage should populated $")
    public void homepage_should_populated() throws Throwable {
    	//code
    	System.out.println("login successful");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	//code
    	System.out.println("cards are showing");
    }

}