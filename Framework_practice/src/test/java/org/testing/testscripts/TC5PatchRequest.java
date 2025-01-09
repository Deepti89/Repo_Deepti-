package org.testing.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HttpMethods;
import org.testing.utilities.JsonHandling;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesHandling;
import org.testng.annotations.Test;

public class TC5PatchRequest {
	
	@Test
	
	public void testcase5() throws IOException
	
	{
		String requestbody= JsonHandling.readJsonFile("../Framework_practice/src/test/java/org/testing/resources/patchRequest.json");
		Properties prObject = PropertiesHandling.readProperties("../Framework_practice/Environment.Properties");
		
		requestbody= JsonReplacement.jsonHandling(requestbody, "Id",TC1PostRequest.idValue);
		
		HttpMethods obj = new HttpMethods(prObject);
		obj.PatchRequest(requestbody, "API_URI", TC1PostRequest.idValue);
	}

}
