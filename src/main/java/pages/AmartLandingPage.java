package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import resources.Base;

public class AmartLandingPage extends Base{
	WebDriver driver;
	public AmartLandingPage(WebDriver driver)
	{
		this.driver=driver;
	}

	private By signInLink = By.xpath("//*[@class='login']");

	public AmartSignInAndRegisterPage clickSignInLink()
	{
		driver.findElement(signInLink).click();
		return new AmartSignInAndRegisterPage(driver);
	}
}
