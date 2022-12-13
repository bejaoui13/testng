package datadrivertestng;

import static org.testng.Assert.assertEquals;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DataDrivenAddNewEmplL {

	@SuppressWarnings("unchecked")
	@Test(dataProvider = "employedataprovider")
	public void postNewEmployeL(String ename, String eage, String esal) throws Exception {

		try {
			RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1";
			RequestSpecification httpreq = RestAssured.given();

			JSONObject reqparametre = new JSONObject();

			reqparametre.put("name", ename);
			reqparametre.put("age", eage);
			reqparametre.put("salary", esal);

			httpreq.header("Content-type", "application/json");
			httpreq.body(reqparametre.toJSONString());

			Response responsee = httpreq.request(Method.POST, "/create");
			String responsBody = responsee.getBody().asString();

			System.out.println("Reponse bodys : " + responsBody);

			assertEquals(responsBody.contains(ename), true);
			assertEquals(responsBody.contains(eage), true);
			assertEquals(responsBody.contains(esal), true);

			int statuscode = responsee.getStatusCode();
			assertEquals(statuscode, 200);
			System.out.println(statuscode);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@DataProvider(name = "employedataprovider")
	String[][] getEmplData() {
		
		String emplData[][] = { { "abc", "3000", "40" }, { "ahh", "4000", "30" }, { "ssss", "2000", "20" } };
		return (emplData);

	}
}
