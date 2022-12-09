package datadrivertestng;

import static org.testng.Assert.assertEquals;

import java.io.IOException;


import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DataDrivenExcel {

	@SuppressWarnings("unchecked")
	@Test(dataProvider = "employedataprovider1")
	public void postNewEmployeL(String ename, String eage, String esal) throws IOException {

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
	}

	@DataProvider(name = "employedataprovider1")
	String[][] getEmplData() throws IOException {

		 
			String path = System.getProperty("user.dir") + "/src/test/java/datadrivertestng/empdata.xlsx";
			int lignenum = Xutils.getRowCount(path, "Feuil2");
			int colcount = Xutils.getCellCount(path, "Feuil2", 1);

			String emplData[][] = new String[lignenum][colcount];

			for (int i = 1; i < lignenum; i++) {
				for (int j = 0; j < colcount; j++) {
					emplData[i - 1][j] = Xutils.getCellData(path, "Feuil2", i, j);
				}
			}
			
			return (emplData);

		 	}

}
