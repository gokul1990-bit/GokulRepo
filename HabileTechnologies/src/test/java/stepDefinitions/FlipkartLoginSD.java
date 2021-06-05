package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FlipkartHomePage;
import pages.FlipkartLoginPage;

public class FlipkartLoginSD {

	WebDriver driver = null;

	FlipkartLoginPage obj1 = null;

	FlipkartHomePage obj2;

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

	}

	@And("^Clicks on Login button$")
	public void clicks_on_login_button() throws Throwable {

		obj1.clickLogin();

	}

	@Then("^The user should be nvigated to the home page of the application$")
	public void the_user_should_be_nvigated_to_the_home_page_of_the_application() throws Throwable {

		//obj2 = new FlipkartHomePage(driver);

		Assert.assertTrue(
				driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).isDisplayed());

		System.out.println("After checking the flipkart search, this line is displayed");

	}

	@Given("The user is on the Flipkart home page ")
	public void the_user_is_on_the_flipkart_home_page() throws Throwable {
		
		String xpath = "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[1]/div/a[1]/img";
		Assert.assertTrue(driver.findElement(By.xpath(xpath)).isDisplayed());
		System.out.println("The given home page has been verified june 5th");
	}

	@When("The users searches for the product and navigates to the product details page ")
	public void the_users_searches_for_the_product_and_navigates_to_the_product_details_page() throws Throwable {
		throw new PendingException();
	}

	@Then("The product should be added in the My Cart section ")
	public void the_product_should_be_added_in_the_my_cart_section() throws Throwable {
		throw new PendingException();
	}

	@And("The user adds the product to the Cart section ")
	public void the_user_adds_the_product_to_the_cart_section() throws Throwable {
		throw new PendingException();
	}

}
