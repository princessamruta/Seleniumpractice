package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangeHrmliveLogIn 
{

	public static void main(String[] args) 
	{
		String driverpath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverpath);
		
				
		WebDriver  driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		//find element &enter username,password & click login
		WebElement uname=driver.findElement(By.name("username"));
		//uname.clear();
		uname.click();
		uname.sendKeys("Admin");
		
		
		WebElement pass=driver.findElement(By.name("password"));
		pass.clear();
		pass.sendKeys("admin123");
		
		WebElement loginButton=driver.findElement(By.id("btnLogin"));
		loginButton.click();
		
		//verify homepage
		String homePageTitle=driver.getTitle();
		System.out.println("Home page title :"+homePageTitle);
		System.out.println("home page validation status: " +homePageTitle.contains("OrangeHRM"));
		
		
		//click logout
	    WebElement logOutButton=driver.findElement(By.tagName("a"));
	    logOutButton.click();
		
		
	    driver.close();
		
		
	}

}
	
