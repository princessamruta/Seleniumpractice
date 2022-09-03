package SeleniumPractice;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser 
{

	public static void main(String[] args)
	{

		System.setProperty("webdriver.gecko.driver",
				"D:\\Eclipse-workspace\\SeleniumBasic\\Executables\\geckodriver.exe");
		FirefoxDriver fdriver = new FirefoxDriver();
		fdriver.get("https://www.google.com");
		fdriver.close();
	}
}


	
