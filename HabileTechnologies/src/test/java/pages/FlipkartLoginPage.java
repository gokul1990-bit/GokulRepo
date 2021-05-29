package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLoginPage {

	WebDriver driver;

	public FlipkartLoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	WebElement username;

	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
	WebElement password;

	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")
	WebElement LoginButton;

	public void enterUsername(String usernameText) {

		username.sendKeys(usernameText);

		System.out.println("+++++++++++Flipkart Username+++++++++++++");
	}

	public void enterPassword(String passwordtext) {

		password.sendKeys(passwordtext);
		System.out.println("+++++++++++Flipkart password+++++++++++++");
	}

	public void clickLogin() {

		LoginButton.click();
	}

}
