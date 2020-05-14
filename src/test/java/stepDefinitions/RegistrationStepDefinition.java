//package stepDefinitions;
//
//
//import java.util.List;
//
//import org.junit.runner.RunWith;
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.cucumber.junit.Cucumber;
//
//@RunWith(Cucumber.class)
//public class RegistrationStepDefinition {
//
//    @Given("^User is on registration page$")
//    public void user_is_on_registration_page() throws Throwable {
//    }
//
//    @When("^User enters fullName,emailAdd,pass,conPass in the fields$")
//    public void user_enters_fullnameemailaddpassconpass_in_the_fields(DataTable table) throws Throwable {
//    	List<List<String>> l=table.cells();
//    	System.out.println(l.get(0).get(0));
//    }
//    
//
//    @Then("^Click on terms and condistions checkbox$")
//    public void click_on_terms_and_condistions_checkbox() throws Throwable {
//    }
//
//    @And("^Sees the regisration success page$")
//    public void sees_the_regisration_success_page() throws Throwable {
//    }
//
//}