package org.testing.trigger;

import java.io.IOException;

import org.testing.testscripts.TC1PostRequest;  // Corrected import
import org.testing.testscripts.TC2GetAllRequest;  // Corrected import
import org.testing.testscripts.TC3GetParticularRequest;
import org.testing.testscripts.TC4PutRequest;
import org.testing.testscripts.TC5PatchRequest;
import org.testing.testscripts.TC6DeleteRequest;

public class Trigger {

    public static void main(String[] args) throws IOException {
    	
    	
    	System.out.println("********Testcase1**********");

        // Creating instances of the test classes
        TC1PostRequest tc1 = new TC1PostRequest();  // Using the corrected class name
        tc1.testcase1();  // Assuming this method exists in TC1PostRequest 
        
        System.out.println("********Testcase2**********");
        TC2GetAllRequest tc2 = new TC2GetAllRequest();  // Using the corrected class name
        tc2.testcase2();  // Assuming this method exists in TC2GetAllRequest 
        
        System.out.println("********Testcase3**********");
        TC3GetParticularRequest tc3 = new TC3GetParticularRequest();
        tc3.testcase3(); 
        
        System.out.println("********Testcase4**********");
        TC4PutRequest tc4 = new TC4PutRequest();
        tc4.testcase4(); 
        
        System.out.println("********Testcase5**********");
        TC5PatchRequest tc5 = new TC5PatchRequest();
        tc5.testcase5(); 
        
        System.out.println("********Testcase6**********");
        TC6DeleteRequest tc6 = new TC6DeleteRequest();
        tc6.testcase6(); 
        
        
        
    }
    
    
    
    
}
