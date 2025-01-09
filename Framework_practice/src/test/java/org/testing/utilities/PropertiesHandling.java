package org.testing.utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesHandling {

    public static Properties readProperties(String filepath) throws IOException {
        // Check if the file exists before trying to read it
        File f = new File(filepath);
       
        
         // Create FileReader for reading the file
        FileReader fr = new FileReader(f);
        
        // Load properties from the file
        Properties pr = new Properties();
        pr.load(fr);
        
        // Close the FileReader (good practice)
        fr.close();
        
        return pr;
    }
}