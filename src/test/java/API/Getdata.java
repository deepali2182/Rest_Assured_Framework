package API;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;


public class Getdata {
	
	@Test
	public void GetResponse() {
	
		int code = get("https://api.openweathermap.org/data/2.5/weather?q=london&appid=b1b15e88fa797225412429c1c50c122a1").getStatusCode();
		
		System.out.println("status code: " +code);

		Assert.assertEquals(code, 200);
		

		
	}
	
	public void Getcity() {
		
		String body = get("https://api.openweathermap.org/data/2.5/weather?q=london&appid=b1b15e88fa797225412429c1c50c122a1").getBody().toString();
		
		System.out.println("response body: " +body);

		Assert.assertTrue(body.contains("London"));
		
	}


}
