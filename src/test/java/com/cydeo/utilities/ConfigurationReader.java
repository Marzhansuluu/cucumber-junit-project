package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    //1-Create the obj of Properties class
    //We need Properties class to use method coming from class like load() and getProperty("key")
    //it is static because we using it in static method
    private static Properties properties = new Properties();

    //we want to open the properties file and load properties obj ONLY once before reading
    //having static block because static runs first.
    static{

        try {
            //2- Create the obj of FileInputStream
            // We need this obj to open file as a stream in Java memory
            FileInputStream file = new FileInputStream("configuration.properties");//path

            //3- Load the properties object using FileInputStream object
            // Load "properties" object with the "file" we opened using FileInputStream
            properties.load(file);

            //close the file after loading
            //if we do not close the file, it won't give an issue, it will take space from computer memory like Scanner
            file.close();
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
    /*
    This method is used to read value from a configuration.properties file
    @param keyword--> value for the key. return null if key is nor found.
    driver.get(ConfigurationReader.getProperty("env")
     */

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }


}
