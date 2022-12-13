package assuranceAutomation;


import static org.testng.Assert.assertEquals;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class TC001_GET_request {

	@SuppressWarnings("unchecked")
	@Test 
	void getDetail()
	{
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		RequestSpecification httprequest = RestAssured.given();
		
		JSONObject requestparam = new JSONObject();
		requestparam.put("userId", "1");
		requestparam.put("id", "122");
		requestparam.put("title", "nantium");
		requestparam.put("body", "consect voluptas");
		httprequest.header("content-type", "application/json");
		httprequest.body(requestparam.toJSONString());
		Response response= httprequest.request(Method.PUT,"/posts/1");
		
		
		
		// Response response = httprequest.request(Method.GET,"/posts");
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);
		
		
		 		int statuscode = response.getStatusCode();
		 	System.out.println("number :" + statuscode);
	 	 assertEquals(statuscode, 200);
		 
	String statusligne = response.getStatusLine();
	System.out.println("number ligne:" + statusligne);
			  assertEquals(statusligne, "HTTP/1.1 200 OK");

	}
}
