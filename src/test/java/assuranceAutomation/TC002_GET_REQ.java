package assuranceAutomation;

 

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC002_GET_REQ {
	
	@Test
	public void getWeatherDetail()
	{
		//base url 
		RestAssured.baseURI="https://developers.google.com";
		
		//request
		RequestSpecification HttpReq = RestAssured.given();
		
		//response 
		Response response = HttpReq.request(Method.GET, "/maps/api/place/nearbysearch/xml?location=23.006000,72.601100&types=point_of_interest&radius=50000&sensor=false&key=YouAPIKey");
	
	     String reponseBody = response.getBody().asString();
	     System.out.println(reponseBody);
	     
	     Headers allheader = response.headers();
	     
	     for(Header header:allheader)
	     {
	    	 System.out.println(header.getName()+ "     "+header.getValue());
	     } 
	}

}
