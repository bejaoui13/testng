package datadrivertestng;

import static org.testng.Assert.assertEquals;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class DataDrivenAddNewEmpl {
	
	@SuppressWarnings("unchecked")
	@Test
	public void postNewEmploye()
	
	{
		RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1";
		RequestSpecification httpReque = RestAssured.given();
		JSONObject requestParametre = new JSONObject();
		
		requestParametre.put("name","aaa");
		requestParametre.put("salary","123");
		requestParametre.put("age","22");
 		
		httpReque.header("Content-type","application/json");
		
		httpReque.body(requestParametre.toJSONString());
		
		Response response=httpReque.request(Method.POST,"/create");
	    String responseBody=response.getBody().asString();
	    
	  
	    assertEquals(responseBody.contains("aaa"), true);
	    assertEquals(responseBody.contains("123"), true);
	    assertEquals(responseBody.contains("22"), true);
 	    
	    int statuscode =response.getStatusCode();
	    assertEquals(statuscode, 200);
	    System.out.println(statuscode);
	
	}

}
