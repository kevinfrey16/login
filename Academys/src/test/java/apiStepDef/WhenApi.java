package apiStepDef;

import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class WhenApi {

	public static Response resp;
	public static RequestSpecification ret = GivenApi.rt;
	
	@When("User send a get request to {string}")
	public void user_send_a_get_request_to(String path) {
	    // Write code here that turns the phrase above into concrete actions
		resp = ret.when().get(path);
	}
}
