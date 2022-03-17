package stepDef;

import com.github.dockerjava.api.model.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.commonMethods;

public class homePageStepDef extends commonMethods{
	
	
	@Given("User is on HomePage")
	public void user_is_on_home_page() {
	   System.out.println("user is on home page");
	}

	@When("User navigates to shopPage")
	public void user_navigates_to_shop_page() {
		   System.out.println("user navigates to shopage");

	}
	
	
	@When("User navigates searchPage using big yello button")
	public void user_navigates_search_page_using_big_yello_button() {
		   System.out.println("here is the yellow button");

	}

	@When("searchs for an item")
	public void searchs_for_an_item() {
		   System.out.println("user searchs for an item");

	}

	@Then("results count should be displayed with number")
	public void results_count_should_be_displayed_with_number() {
		   System.out.println("results number displayed");

	}
	


	@Then("asdasd asasdasd asdasd")
	public void asdasd_asasdasd_asdasd() {
	   
	}
	
	
	@Then("test123")
	public void test123(){
		
	}

	
	@Then("user enter username <string> and password <string>")
	public void login(String username, String password){
		//logic 
	}
	
	@Given("user enter username {string} and password {string} list")
	public void user_enter_username_and_password_list(String string, String string2) {
	   
		System.out.println("Username --> " + string);
		System.out.println("Password --> " + string2);
		
		
	}

	@Then("I have added wait <int>")
	public void login(int milisec){
		//logic
	}

	
	@Then("user enter username {string} and password {string}")
	public void user_enter_username_and_password(String string, String string2) {
	    System.out.println(string);
	    System.out.println(string2);
	}
	@Then("I have added wait {int}")
	public void i_have_added_wait(Integer int1) {
	    System.out.println(int1);
	}


}
