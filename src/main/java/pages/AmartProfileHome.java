package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import resources.Base;

public class AmartProfileHome extends Base {
	WebDriver driver;
public AmartProfileHome(WebDriver driver)
{
	this.driver=driver;
}
private By pageHeader=By.cssSelector("h1.page-heading");
private By logOut=By.cssSelector("a.logout");

public String getPageHeading()
{
	return driver.findElement(pageHeader).getText();
}
public void clickLogout()
{
	driver.findElement(logOut).click();
}
}
