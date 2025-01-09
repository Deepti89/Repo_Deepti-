package org.testing.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HttpMethods;
import org.testing.utilities.ParsingJsonUsingOrgJson;
import org.testing.utilities.PropertiesHandling;
import org.testng.annotations.Test;

import io.restassured.response.Response;


public class TC2GetAllRequest {
	
	@Test  
	
	public void testcase2()throws IOException
	
	{
		Properties prObject = PropertiesHandling.readProperties("../Framework_practice/Environment.Properties");	
		HttpMethods obj = new HttpMethods(prObject);
		Response re = obj.getAllRequest("API_URI");
		ParsingJsonUsingOrgJson.jsonParse(re.asString(), "id");
		
	}

}
