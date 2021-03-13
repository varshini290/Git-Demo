package com.testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Drivers.Driversclass;
import com.pages.Homepage;
import com.utilse.SystemUtilse;

public class TC1_signinvalidation {

	WebDriver driver;
	static Driversclass driverclass = new Driversclass();
	static SystemUtilse selutil = new SystemUtilse();
	static Homepage homepage;
	
	@BeforeMethod
	public void initialSetup()
	{
		
		driver= driverclass.launchDriver();
		selutil.Enterurl(driver, "http://automationpractice.com/index.php");
		
	}
	@Test
	public void signinvalidation() {
		homepage = new Homepage(driver);
		homepage.clicksign();
		String expectedUrl = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
		String actualUrl = driver.getCurrentUrl();
        selutil.validatePageUrl(expectedUrl, actualUrl);
	}
        
        
 @AfterMethod
  public void testend()
  {
	  selutil.endRun(driver);
  }
	  
  }
	


