package assuranceAutomation;


import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class TC001_GET_request {

	@Test 
	void getDetail()
	{
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
		RequestSpecification httprequest = RestAssured.given();
		Response response = httprequest.request(Method.GET,"/posts");
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);
		
		int statuscode = response.getStatusCode();
		System.out.println("number :" + statuscode);
	 
		 assertEquals(statuscode, 20);
	}
}
