package com.ithis.tests.integration;

import java.util.List;

import org.junit.Test;
//import org.mule.api.MuleException;
//import org.mule.api.MuleMessage;
//import org.mule.module.client.MuleClient;





import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;
import static com.jayway.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class PipelineITCase {

	@Test
	public void reallyTestingThatInterfaceTest() throws Exception{
		//MuleClient client = new MuleClient(true);
		
		//MuleMessage response = client.send("http://jsonplaceholder.typicode.com/comments", null, null);
		
		// Example with JsonPath
//		Response json = get("http://jsonplaceholder.typicode.com/comments");
		Response json = get("http://localhost:8081/test");


//		List<String> emails = json.path("email");
//		
//		System.out.println("Response is: " + response.getPayload());
//		
//		String res = (String) response.getPayload();
		
		
		System.out.println("Response is: " + json.asString());

	}


}
