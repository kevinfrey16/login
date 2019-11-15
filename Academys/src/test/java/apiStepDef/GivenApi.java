package apiStepDef;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GivenApi {

	public static RequestSpecification rt;
	
	@Given("User send an id {int}")
	public void user_send_an(Integer index) {
	    // Write code here that turns the phrase above into concrete actions
		RestAssured.baseURI = "https://reqres.in/";
		rt = RestAssured.given();
		rt.pathParam("id", index);
	}
}
