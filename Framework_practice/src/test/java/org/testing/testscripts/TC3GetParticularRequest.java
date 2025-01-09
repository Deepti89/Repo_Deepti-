package org.testing.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HttpMethods;

import org.testing.utilities.PropertiesHandling;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC3GetParticularRequest {
	@Test
	
	public void testcase3()throws IOException
	
	{
		Properties prObject = PropertiesHandling.readProperties("../Framework_practice/Environment.Properties");	
		HttpMethods obj = new HttpMethods(prObject);
		Response re = obj.getParticularRequest("API_URI", TC1PostRequest.idValue);
		
		
	
	

}
	
}
