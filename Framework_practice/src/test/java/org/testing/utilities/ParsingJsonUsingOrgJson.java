package org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;

public class ParsingJsonUsingOrgJson {

    public static void jsonParse(String responseData, String fetchVariable) {
        // Convert the response data to a JSON array
        JSONArray array = new JSONArray(responseData);
        
        // Get the length of the array
        int L = array.length();
        
        // Loop through each element of the array
        for (int i = 0; i < L; i++) {
            JSONObject ob = array.getJSONObject(i);
            
            // Check if the fetchVariable (e.g., "Id") exists in the current object
            if (ob.has(fetchVariable)) {
                // If the fetchVariable exists, print its value
                System.out.println(ob.get(fetchVariable));
            } else {
                // If the fetchVariable does not exist, print a message indicating so
                System.out.println("Key '" + fetchVariable + "' not found in object " + (i + 1));
            }
        }
    }
}