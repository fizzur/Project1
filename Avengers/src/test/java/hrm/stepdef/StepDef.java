package hrm.stepdef;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hrm.actions.HrmActions;

public class StepDef {
	
	HrmActions menubuttontest = new HrmActions();
	
	
	@Given("^I am on the homepage$")
	public void i_am_on_the_homepage(){
		String actualTitle = menubuttontest.Hrmmenubuttonpage();
		// Assert.assertEquals(acttualTitle, expected);
		System.out.println(actualTitle);
		
	    
	}

	@When("^I click the provided feature button link$")
	public void i_click_the_provided_feature_button_link(){
		menubuttontest.Hrmmenubuttonpage();
		
		
	}

	@Then("^I should see the button click confirmation$")
	public void i_should_see_the_button_click_confirmation(){
		Assert.assertEquals(menubuttontest.Hrmmenubuttonpage(), "HR Management System | OrangeHRM l HR Management Software");
	}


}
