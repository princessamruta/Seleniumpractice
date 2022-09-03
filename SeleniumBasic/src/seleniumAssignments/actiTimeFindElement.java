package seleniumAssignments;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTimeFindElement 
{
		public static void main(String[] args) throws InterruptedException
		{

				    String driverpath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
					System.setProperty("webdriver.chrome.driver",driverpath);
					
					WebDriver driver=new ChromeDriver();
					
					driver.get("https://demo.actitime.com/login.do");
					
					
					//implicit wait
					driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
					
					//to get page title
					String pageTitle=driver.getTitle();
					System.out.println("page title is:"+pageTitle);
					System.out.println("page title length is:"+pageTitle.length());
					String expectedTitle="actiTIME - Login";
					
					
					//validating login page
					System.out.println("Title validation status is:"+pageTitle.equals(expectedTitle));
					
					//verify login page
					System.out.println("Title validation status :"+pageTitle.equals(expectedTitle));
									
					
					//finding element & enter usernAME
					WebElement username=driver.findElement(By.id("username"));
					username.clear();
					username.sendKeys("admin");
					
					//finding element & enter password
					WebElement password=driver.findElement(By.name("pwd"));
					password.clear();
					password.sendKeys("manager");
					
					//finding element & click login
					WebElement loginButton=driver.findElement(By.id("loginButton"));
					loginButton.click();
					
					//explicit wait
					Thread.sleep(2000);
					
					
					//verify homepage
					String homePageTitle=driver.getTitle();
					System.out.println("home page title:"+homePageTitle);
					System.out.println("home page validation status:"+homePageTitle.equals("actiTIME - Enter Time-Track"));
					
					
					//click logout
					WebElement logOutButton=driver.findElement(By.id("logoutLink"));
					logOutButton.click();		
									
					
					//close the browser
					driver.close();						    					
		}
	}


		
