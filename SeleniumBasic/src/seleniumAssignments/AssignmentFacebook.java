package seleniumAssignments;

import org.openqa.selenium.firefox.FirefoxDriver;

public class AssignmentFacebook {

	public static void main(String[] args)
	{
		String driverpath=System.getProperty("user.dir")+"\\executables\\geckodriver.exe";//D:\java class software\eclipse\Eclipse-workspace\SeleniumBasic\Executables
		System.out.println(driverpath);
		System.setProperty("webdriver.gecko.driver",driverpath);
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		
		String pageTitle=driver.getTitle();
		System.out.println("pageTitle");
		String expectedTitle="Facebook – log in or sign up";
		System.out.println("Title validation:"+pageTitle.equals(expectedTitle));
		
		String pageURL=driver.getCurrentUrl();
		String expectedURL="https://m.facebook.com/?_rdr";
		System.out.println("Page URL validation:"+pageURL.equals(expectedURL));
		
		int contentLength=driver.getPageSource().length();
		System.out.println("Content length:"  +contentLength);
		
		driver.close();		
	}

}
