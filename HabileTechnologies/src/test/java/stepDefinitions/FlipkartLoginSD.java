package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipkartLoginSD {

	WebDriver driver = null;

	@Given("^The user is present in the login of the application$")
	public void the_user_is_present_in_the_login_of_the_application() throws Throwable {

	}

	@When("^The user enters (.+) and (.+)$")
	public void the_user_enters_and(String username, String password) throws Throwable {

	}

	@And("^Clicks on Login button$")
	public void clicks_on_login_button() throws Throwable {

	}

	@Then("^The user should be nvigated to the home page of the application$")
	public void the_user_should_be_nvigated_to_the_home_page_of_the_application() throws Throwable {

	}

}