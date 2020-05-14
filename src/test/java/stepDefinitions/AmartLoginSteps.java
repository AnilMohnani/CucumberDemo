package stepDefinitions;

import org.junit.Assert;
import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

import pages.AmartLandingPage;
import pages.AmartProfileHome;
import pages.AmartSignInAndRegisterPage;
import resources.Base;

@RunWith(Cucumber.class)
public class AmartLoginSteps extends Base {
	AmartProfileHome apm;
    @Given("^User is on Login Screen of the Amart App$")
    public void user_is_on_login_screen_of_the_amart_app()  {
    	driver=inialisation();
    	driver.get(prop.getProperty("url"));
    	AmartLandingPage alp=new AmartLandingPage(driver);
    	alp.clickSignInLink();
    }

    @When("^User enters email and password$")
    public void user_enters_email_and_password()  {
    	AmartSignInAndRegisterPage asiarp=new AmartSignInAndRegisterPage(driver);
    	 apm =asiarp.login();
    }

    @Then("^User must be successfully log into App$")
    public void user_must_be_successfully_loginto_app() {
    	String actualPageHeading=apm.getPageHeading();
    	Assert.assertEquals("My account", actualPageHeading);
}
    
    @When("^User is on profile home screen$")
    public void user_is_on_profile_home_screen()  {
    	System.out.println(driver.getTitle());

    }

    @Then("^User clicks on logout$")
    public void user_clicks_on_logout() {
    	AmartProfileHome apm1=new AmartProfileHome(driver);

    	apm1.clickLogout();
    	driver.close();
    	
    }

}