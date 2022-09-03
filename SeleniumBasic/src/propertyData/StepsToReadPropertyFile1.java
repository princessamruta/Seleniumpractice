package propertyData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


public class StepsToReadPropertyFile1 
{
	
		public static void main(String[] args) throws IOException 
		{
						/*
			 * 1. First find the location where you have stored property file
			   2. Create an instance of FileInputStream class and pass the property file location to its constructor.
			   3. Create an instance of Properties class
			   4. With the help of properties reference variable call load() properties class and pass FileInputStream class reference to this method
	   		   5. Call get(key) of Properties class to read data from property file
			 */
			/*Property file location with 
			 * absolute path: "D:\\class software\\Eclipse\\SeleniumBasic\\src\\PropertyFile\\TestData.properties";
			 * relative path: .\PropertyFile\TestData.properties
			 * Using System class:
			 * 			String currentDir=System.getProperty("user.dir");
			 * 			String propertyFileLocation =currentDir+"\\PropertyFile\\TestData.properties";
			 */
			String fileLocation="D:\\class software\\Eclipse\\SeleniumBasic\\src\\PropertyFile\\TestData.properties";
			
			FileInputStream fis = new FileInputStream(fileLocation);
		
			
			Properties prop=new Properties();	
			
			prop.load(fis);
			
			String pAmount=prop.getProperty("principleAmount");
			System.out.println(pAmount);
			int amount=Integer.parseInt(pAmount);
			int res=amount/10;
			int roi=Integer.parseInt(prop.getProperty("roi"));
			
			//to wrote content into the file use setProperty()
			prop.setProperty("Subject3", "Selenium-Java");
			prop.setProperty("Subject4", "QTP-JavaScript");
			//location where you want to save your file using FileOutputStream
			FileOutputStream fos= new FileOutputStream("D:\\class software\\Eclipse\\SeleniumBasic\\src\\PropertyFile\\TestData.properties");
			//saving the file into required location using store()
			prop.store(fos, "Added two new keys");
			//close the connection
			fos.close();	
			
			
		}

	}
	
