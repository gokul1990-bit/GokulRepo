package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginPageSD {

	String projectpath = System.getProperty("user.dir");
	// System.setProperty("webdriver.chrome.driver",projectpath+"\\src\\test\\resources\\Resources\\chromedriver.exe");

	WebDriver driver = null;

	LoginPage obj1 = null;

	@Given("^The user is present in the Login page of the application$")
	public void the_user_is_present_in_the_login_page_of_the_application() throws Throwable {
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",
				projectpath + "\\src\\test\\resources\\Resources\\chromedriver.exe");

		driver = new ChromeDriver();
		obj1 = new LoginPage(driver);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.get("https://salesdemo.habiletechnologies.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("This is working till before entering username");
		// obj1 = new LoginPage(driver);
		Assert.assertTrue((driver.getPageSource().contains("SIGN IN TO YOUR ACCOUNT")));

	}

	@When("^The user enters the email (.+) and the password (.+)$")
	public void the_user_enters_the_email_and_the_password(String username, String password) throws Throwable {
		// LoginPage obj2 = new LoginPage(driver);
		System.out.println(obj1);
		System.out.println(username);
		obj1.enterUsername(username);
		obj1.enterPassword(password);

	}

	@Then("^user should be navigated to the CloudBankIn home page$")
	public void user_should_be_navigated_to_the_cloudbankin_home_page() throws Throwable {
		obj1.clickLogin();
	}

	@And("^The user clicks on the SignIn button$")
	public void the_user_clicks_on_the_signin_button() throws Throwable {
		Assert.assertTrue((driver.getTitle().contains("CloudBankIN - A Saas Banking Engine")));
		System.out.println("************************The second assertion is beinf verified********************");

	}

}
