package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FlipkartLoginPage;

public class FlipkartLoginSD {

	WebDriver driver = null;

	FlipkartLoginPage obj1 = null;

	@Given("^The user is present in the login of the application$")
	public void the_user_is_present_in_the_login_of_the_application() throws Throwable {

		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",
				projectpath + "\\src\\test\\resources\\Resources\\chromedriver.exe");

		driver = new ChromeDriver();

		System.out.println("The flipkart functionality is being executed by tester************");

		driver.get("https://www.flipkart.com/");

	}

	@When("^The user enters (.+) and (.+)$")
	public void the_user_enters_and(String username, String password) throws Throwable {

		obj1 = new FlipkartLoginPage(driver);
		obj1.enterUsername(username);
		obj1.enterPassword(password);
		obj1.clickLogin();

	}

	@And("^Clicks on Login button$")
	public void clicks_on_login_button() throws Throwable {

	}

	@Then("^The user should be nvigated to the home page of the application$")
	public void the_user_should_be_nvigated_to_the_home_page_of_the_application() throws Throwable {

	}

}
