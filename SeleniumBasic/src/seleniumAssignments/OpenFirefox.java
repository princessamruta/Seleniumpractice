package seleniumAssignments;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox 
{

	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.gecko.driver","D:\\class software\\Eclipse\\SeleniumBasic\\Executables\\geckodriver.exe");
		FirefoxDriver fdriver = new FirefoxDriver();
		fdriver.get("https://www.google.com");
		fdriver.close();
    }
}
