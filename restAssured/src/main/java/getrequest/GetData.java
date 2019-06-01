package getrequest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetData {
@Test
	public void testResponceCode()
	{
		Response res=RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		int status=res.getStatusCode();
		System.out.println(status);
		
	}
}
