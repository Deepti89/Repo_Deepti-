package org.testing.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HttpMethods;
import org.testing.utilities.JsonHandling;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.ParsingJsonUsingJsonPath;
import org.testing.utilities.PropertiesHandling;
import org.testing.utilities.RandomData;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC1PostRequest {
	
	
	
	static String idValue;
	
	
	@Test

	public  void testcase1() throws IOException {
		
		
		
		String requestbody= JsonHandling.readJsonFile("../Framework_practice/src/test/java/org/testing/resources/inputRequest.json");
		Properties prObject = PropertiesHandling.readProperties("../Framework_practice/Environment.Properties");
		String idvalue = RandomData.generateRandomData();
		requestbody= JsonReplacement.jsonHandling(requestbody, "Id",idvalue);
		HttpMethods obj = new HttpMethods(prObject);
		Response res= obj.PostRequest(requestbody,"API_URI");
		idValue= ParsingJsonUsingJsonPath.jsonParse(res, "id");
		
		System.out.println("Response id value is "+ idValue);
		

	}

}
