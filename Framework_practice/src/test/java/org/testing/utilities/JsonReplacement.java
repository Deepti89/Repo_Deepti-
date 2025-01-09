package org.testing.utilities;

import java.util.regex.Pattern;

public class JsonReplacement {
	
	public static String jsonHandling(String jsonData, String VariableName, String VariableValue)
	
	{
		jsonData = jsonData.replaceAll(Pattern.quote("{{Id}}"), VariableValue);
		return jsonData;
	}

}
