package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmartSignInAndRegisterPage {

	
	WebDriver driver;
	public AmartSignInAndRegisterPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By email=By.id("email");
	private By password=By.id("passwd");
	private By loginBtn=By.id("SubmitLogin");
	public AmartProfileHome login()
	{
		driver.findElement(email).sendKeys("mohnani.anil@gmail.com");
		driver.findElement(password).sendKeys("Anil6746");
		driver.findElement(loginBtn).click();
		return new AmartProfileHome(driver);
		
	}
	
}
