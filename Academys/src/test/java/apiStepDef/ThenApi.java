package apiStepDef;


import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ThenApi {

	RequestSpecification res = WhenApi.ret;
	Response rr = WhenApi.resp;
	
	
	@Then("User should get status code {string}")
	public void user_should_get_status_code(String code) {
	    // Write code here that turns the phrase above into concrete actions
		res.then().statusCode(Integer.parseInt(code));
	}

	@Then("Response data should have an email")
	public void response_data_should_have_an_email() {
	    // Write code here that turns the phrase above into concrete actions
		//System.out.println(res.body().jsonPath().get("data[0].first_name").toString(;);
		System.out.println(rr.body().jsonPath().get("data[0].email").toString());
		
		Assert.assertTrue(rr.body().jsonPath().get("data[0].email").toString().contains("@"));
	}
	
	@Then("Response data should have a selected email")
	public void response_data_should_have_a_selected_email() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(rr.body().asString());
		
		System.out.println(rr.body().jsonPath().get("data.email").toString());
	}

}
