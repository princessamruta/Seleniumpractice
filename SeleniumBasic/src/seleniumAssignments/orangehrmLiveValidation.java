package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrmLiveValidation 
{

	public static void main(String[] args) 
	{
			String driverpath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",driverpath);
			
			WebDriver driver=new ChromeDriver();
			
			//need to enter URL in the opened browser
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
				
			boolean isElementEnabled=driver.findElement(By.id("divUsername")).isEnabled();
			System.out.println("username Element is Enabled: " + isElementEnabled);		
			boolean isElementDisplayed=driver.findElement(By.id("divUsername")).isDisplayed();
			System.out.println("username Element is Enabled:: " + isElementDisplayed);		
			//username.clear();
			
			
			WebElement password=driver.findElement(By.id("txtPassword"));
			boolean isPassElementEnabled=driver.findElement(By.id("txtPassword")).isEnabled();
			System.out.println("Pass Element is Enabled :: " + isPassElementEnabled);		
			boolean isPassElementDisplayed=driver.findElement(By.id("txtPassword")).isDisplayed();
			System.out.println("Pass Element is Enabled: " + isPassElementDisplayed);		
			//password.clear();
			
			
			WebElement logInButton=driver.findElement(By.id("divLogin"));		
			boolean isElementSelected=driver.findElement(By.id("divLogin")).isSelected();
			System.out.println("log in is Selected : " + isElementSelected);		
			
			driver.manage().window().maximize();		
			
			driver.close();
	}

}
