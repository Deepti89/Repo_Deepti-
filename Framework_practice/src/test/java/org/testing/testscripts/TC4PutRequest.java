package org.testing.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HttpMethods;
import org.testing.utilities.JsonHandling;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesHandling;
import org.testng.annotations.Test;


public class TC4PutRequest {
	
	@Test
	
	public void testcase4() throws IOException
	{
		String requestbody= JsonHandling.readJsonFile("../Framework_practice/src/test/java/org/testing/resources/updateRequest.json");
		Properties prObject = PropertiesHandling.readProperties("../Framework_practice/Environment.Properties");
		
		requestbody= JsonReplacement.jsonHandling(requestbody, "Id",TC1PostRequest.idValue);
		
		HttpMethods obj = new HttpMethods(prObject);
		obj.PutRequest(requestbody, "API_URI", TC1PostRequest.idValue);
		
		
	}

}
