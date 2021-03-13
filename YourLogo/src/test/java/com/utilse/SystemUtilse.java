package com.utilse;

import org.openqa.selenium.WebDriver;

public class SystemUtilse {
	
	public void Enterurl(WebDriver driver,String url) {
		driver.get(url);
	}
    public void endRun(WebDriver driver) {
    	driver.quit();
    }
    
   public void validatePageUrl(String expectedurl,String actualurl) {
	   
    }
}
