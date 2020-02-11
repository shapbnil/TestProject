package facebookTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import faceBookPages.LoginPageFactory;
import utility.BrowserFactory;

public class VerifyFacebookFactory {
	
	
	@Test
	public void checkValidUser() {
		
		
		//This will launch browser and specific url
		WebDriver driver=BrowserFactory.startBrowser("chrome", "https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&next=https%3A%2F%2Fwww.facebook.com%2F&lwv=120&lwc=1348028");
		
		
		//Created Page Object using Page Factory

		LoginPageFactory login_page=PageFactory.initElements(driver, LoginPageFactory.class);
		
		//Call the Method
		login_page.loging_facebook("shapbnil@yahoo.com", "Rayyan13");

		
		
		driver.close();
	}

}
