package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class vtigerLoginFindElement
{
	public static void main(String[]args)
	{
		String driverpath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";;
		System.setProperty("webdriver.chrome.driver",driverpath);
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		
		WebElement username=driver.findElement(By.id("username"));
		//sendKeys
		
		driver.close();	
		
	}
}