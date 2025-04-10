package API;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class RestAuth {
	
	@Test
	public void testAuh() {
	
		int code = RestAssured.given()
				.auth().preemptive()
				.basic("ToolsQA", "TestPassword")
				.when()
				.get("https://api.openweathermap.org/")
				.getStatusCode();
				
		
		
		System.out.println("status code: " +code);

		Assert.assertEquals(code, 200);
		
		
		

		
	}
	



}
