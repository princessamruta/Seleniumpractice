package seleniumAssignments;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumValidation 

{
	public static void main(String[] args) throws InterruptedException
	{
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		//to enter required application URL use get() of WebDriver interface
		driver.get("https://demo.actitime.com");
		
		//define implicit wait for browser
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		//identify username field
		WebElement userNameInputField=driver.findElement(By.id("username"));
		System.out.println("User name is displayed or not: "+userNameInputField.isDisplayed());
		System.out.println("User name is functional or not: "+userNameInputField.isEnabled());
		
		String defaultValueInUserNameInputField=userNameInputField.getAttribute("placeholder");
		System.out.println("Default value of user name input field: "+defaultValueInUserNameInputField);
		System.out.println("Default value validation for user name input field status: "+defaultValueInUserNameInputField.equals("Username"));
		
		//identify password  field
		WebElement passwordInputField=driver.findElement(By.name("pwd"));
		System.out.println("Pass word is displayed or not: "+passwordInputField.isDisplayed());
		System.out.println("Pass word is functional or not: "+passwordInputField.isEnabled());
		
		String defaultValueInpasswordInputField=passwordInputField.getAttribute("placeholder");
		System.out.println("Default value of pass word input field: "+defaultValueInpasswordInputField);
		System.out.println("Default value validation for pass word input field status: "+defaultValueInpasswordInputField.equals("Password"));
		
		//login button
		WebElement loginButtonInputField=driver.findElement(By.id("loginButton"));
		System.out.println("Log in button is displayed or not: "+loginButtonInputField.isDisplayed());
		System.out.println("Log in is functional or not: "+loginButtonInputField.isEnabled());
		System.out.println("Log in is selected or not: "+loginButtonInputField.isSelected());
		
		String loginButtonInputFieldName=(loginButtonInputField.getText());
		System.out.println(" log in Text Name is:"+loginButtonInputFieldName);		
		
			
		//check box
		WebElement CheckBoxText=driver.findElement(By.id("keepLoggedInCheckBox"));
		System.out.println(CheckBoxText.isDisplayed());
		System.out.println(CheckBoxText.isEnabled());
		
		String checkBoxTextName1=(CheckBoxText.getText());
		System.out.println("check Box Text Name is:"+checkBoxTextName1);
		
		
		//identify keepLoggedInLabel 
		WebElement keepLoggedInLabelCheckBoxText=driver.findElement(By.id("keepLoggedInLabel"));
		System.out.println(keepLoggedInLabelCheckBoxText.isDisplayed());
		System.out.println(keepLoggedInLabelCheckBoxText.isEnabled());
		
		String checkBoxTextName=keepLoggedInLabelCheckBoxText.getText();
		System.out.println("check Box Text Name is:"+checkBoxTextName);
		
		
		userNameInputField.sendKeys("admin");
		passwordInputField.sendKeys("manager");		
		CheckBoxText.click();
		loginButtonInputField.click();
		
		driver.manage().window().maximize();
		
	    Thread.sleep(2000);
	    
	    WebElement timeTrackElement=driver.findElement(By.id("container_tt"));
	    timeTrackElement.click();
	    
	    WebElement tasksElement=driver.findElement(By.id("container_tasks"));
	    tasksElement.click();
	    
	    WebElement reportsElement=driver.findElement(By.id("container_reports"));
	    reportsElement.click();
	    
	    //refresh
	    driver.navigate().refresh();
	    
	    //forward
	    driver.navigate().forward();
	    
	    //backward
	    driver.navigate().back();
	    
	    //explicit wait
	    Thread.sleep(5000);	
	    
	    //minimize
	    //driver.manage().window().setSize(new Dimension(500,600));
	    
	    //move to another url
	    driver.navigate().to("https://demo.actiplans.com/user/my_schedule.do");
	    
	    //backward
	    driver.navigate().back();
	    
	    //logout
	    WebElement logOutButton=driver.findElement(By.id("logoutLink"));
		logOutButton.click();
	    
		//driver.close();
		
	}
}		