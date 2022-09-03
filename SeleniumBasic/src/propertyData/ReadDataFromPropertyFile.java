package propertyData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ReadDataFromPropertyFile 
 {

	public static void main(String[] args) throws IOException 	{


		//File name and location - Absolute path
		String filePath1="D:\\class software\\Eclipse\\SeleniumBasic\\src\\PropertyFile\\TestData.properties";
				//or relative path
		//String filePath2=".\\PropertyFile\\TestData.properties";
				//or
	    //String filePath3=System.getProperty("user.dir")+"\\PropertyFile\\TestData.properties";
		
		
		//Create an instance of FileInputStream class by passing file location to its constructor
		FileInputStream fis=new FileInputStream(filePath1);
		//Create an instance of Properties class 
		Properties prop=new Properties();
		//with the help of Properties class ref call load() and pass FileInputStream ref as a parameter
		prop.load(fis);
		//read data from property file
		System.out.println(prop.getProperty("applicationUrl"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("pinCode"));
		System.out.println(prop.getProperty("contactNumber"));
	}

}


