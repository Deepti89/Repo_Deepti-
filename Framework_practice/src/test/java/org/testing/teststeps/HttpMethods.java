package org.testing.teststeps;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HttpMethods {
	

		
	   Properties pr;
		public HttpMethods(Properties pr)
		{
			this.pr=pr;
			
		}
		
		public Response PostRequest(String requestbody ,String uriKeyName)
		
		{
			String uriValue = pr.getProperty(uriKeyName);
			
			Response res= given()
			        .contentType(ContentType.JSON)
			        .body(requestbody)
			        .when()
			        .post(uriValue);
			        
			        System.out.println("Status code is"+res.statusCode() );
			        System.out.println("Response Data is"+res.asString() );
			        return res;
		}
		
		
		public Response getAllRequest(String uriKeyName)
		
		{
			String uriValue = pr.getProperty(uriKeyName);
			Response res = given()
			        .contentType(ContentType.JSON)
			        
			        .when()
			        .get(uriValue);
			        
			        System.out.println("Status code is"+res.statusCode() );
			        System.out.println("Response Data is"+res.asString() );
			        
			        return res;
		}
		
		
       public Response getParticularRequest(String uriKeyName, String endpoint)
		
		{
			String uriValue = pr.getProperty(uriKeyName) + "/" + endpoint;
			Response res = given()
			        .contentType(ContentType.JSON)
			        
			        .when()
			        .get(uriValue);
			        
			        System.out.println("Status code is"+res.statusCode() );
			        System.out.println("Response Data is"+res.asString() );
			        
			        return res;
		}
       
       public Response PutRequest(String requestbody ,String uriKeyName, String endpoint)
		
		{
			String uriValue = pr.getProperty(uriKeyName) + "/" + endpoint;
			
			Response res= given()
			        .contentType(ContentType.JSON)
			        .body(requestbody)
			        .when()
			        .put(uriValue);
			        
			        System.out.println("Status code is"+res.statusCode() );
			        System.out.println("Response Data is"+res.asString() );
			        return res;
		}
					
       
       public Response PatchRequest(String requestbody ,String uriKeyName, String endpoint)
		
		{
			String uriValue = pr.getProperty(uriKeyName) + "/" + endpoint;
			
			Response res= given()
			        .contentType(ContentType.JSON)
			        .body(requestbody)
			        .when()
			        .patch(uriValue);
			        
			        System.out.println("Status code is"+res.statusCode() );
			        System.out.println("Response Data is"+res.asString() );
			        return res;
		}
       
       public Response DeleteRequest(String uriKeyName, String endpoint)
		
		{
			String uriValue = pr.getProperty(uriKeyName) + "/" + endpoint;
			Response res = given()
			        .contentType(ContentType.JSON)
			        
			        .when()
			        .delete(uriValue);
			        
			        System.out.println("Status code is"+res.statusCode() );
			        System.out.println("Response Data is"+res.asString() );
			        
			        return res;
		}
					
					
					
					
		}
	


