package org.testing.utilities;

import io.restassured.response.Response;

public class ParsingJsonUsingJsonPath {
	
	public static String jsonParse(Response resobj, String jsonpath)
	
	{
		String fetchValue= resobj.jsonPath().get(jsonpath);
		return fetchValue;
		
	}

}
