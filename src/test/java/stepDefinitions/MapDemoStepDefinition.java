//package stepDefinitions;
//
//import java.util.List;
//import java.util.Map;
//
//import org.junit.runner.RunWith;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.cucumber.junit.Cucumber;
//
//@RunWith(Cucumber.class)
//public class MapDemoStepDefinition {
//	
//	@Before
//	public void setup()
//	{
//		System.out.println("before scenario");
//	}
//	
//	@After
//	public void tear()
//	{
//		System.out.println("after scenario");
//	}
//
//    @Given("^The User has launched the website$")
//    public void user_launches_the_website() throws Throwable {
//    }
//
//	@When("^Username and Password is entered by user$")
//    public void user_enters_username_and_password(DataTable credentials) throws Throwable {
//    	List<Map<String, String>> mp=credentials.asMaps(String.class,String.class);
//    	for(int i=0;i<mp.size();i++)
//    	{
//    		System.out.println(mp.get(i).get("username"));
//    		System.out.println(mp.get(i).get("password"));
//
//    		
//    	}
//    	    }
//
//    @Then("^For map demo User clicks Login$")
//    public void user_clicks_login() throws Throwable {
//    }
//
//}