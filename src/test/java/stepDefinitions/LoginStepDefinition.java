//package stepDefinitions;
//import org.junit.runner.RunWith;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.cucumber.junit.Cucumber;
//
//
//@RunWith(Cucumber.class)
//public class LoginStepDefinition {
//	public WebDriver driver;
//
//    @Given("^We are at application landing page$")
//    public void we_are_at_application_landing_page() throws Throwable {
//
//    	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver.exe");
//    	driver=new ChromeDriver();
//    	driver.get("https://login.salesforce.com/?locale=eu");
//    }
//  
//
//    @When("^user logs in using Username as (.+) and Password (.+)$")
//    public void user_logs_in_using_username_as_and_password(String user, String password) throws Throwable {
//    	driver.findElement(By.id("username")).sendKeys(user);
//    	driver.findElement(By.id("password")).sendKeys(password);
//    	driver.findElement(By.id("Login")).click();
//    	
//    }
//
//    @Then("^User must land to application home page$")
//    public void user_must_land_to_application_home_page() throws Throwable {
//    	Assert.assertTrue(driver.findElement(By.cssSelector("#error")).isDisplayed());
//    	driver.close();
//
//    }
//
//}