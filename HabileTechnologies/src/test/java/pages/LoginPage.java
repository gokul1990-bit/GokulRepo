package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage {

	@FindBy(xpath = "//*[@id=\"uid\"]")
	WebElement email;

	@FindBy(id = "pwd")
	WebElement Password;

	@FindBy(id = "login-button")
	WebElement SignIn;

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}

	public void enterUsername(String username) {

		System.out.println("This is working till entering username");

		System.out.println(username);
		email.sendKeys(username);

	}

	public void enterPassword(String password) {

		Password.sendKeys(password);
	}

	public void clickLogin() {

		SignIn.click();
	}
}
