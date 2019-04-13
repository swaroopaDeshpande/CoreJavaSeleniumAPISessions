package APIRestCallsTests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestUtil.Constants;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GETCallTest {

	@Test
	public void getTestData() {
		RestAssured.baseURI = Constants.BaseUrI;
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, "/employees");
		System.out.println("Response body is"+response.getBody().asString());
		int statusCode=response.getStatusCode();
		System.out.println("Status code is"+statusCode);
		Assert.assertEquals(statusCode, 200);
		Headers header=response.getHeaders();
		System.out.println("Header are"+header);
		String statusLine=response.statusLine();
		System.out.println(statusLine);
		JsonPath jsonPath=response.jsonPath();
		List<String> it=jsonPath.getList("id");
		
		System.out.println("No of employees are: " +it.size());
		for(int i=0;i<=it.size();i++)
		{
			System.out.println(it.get(i));
		}
			
		
	}

}
