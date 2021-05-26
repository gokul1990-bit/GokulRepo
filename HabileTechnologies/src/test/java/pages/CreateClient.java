package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateClient {

	WebDriver driver;

	public CreateClient(WebDriver driver) {

		this.driver = driver;
	}

	@FindBy(id = "client-dropdown")
	WebElement clientDropDown;

	public void clientDropDown() {

		Select s = new Select(clientDropDown);
		s.selectByIndex(0);

	}

}
