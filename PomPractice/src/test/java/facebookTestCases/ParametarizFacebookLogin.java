package facebookTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import faceBookPages.LoginPagePara;

public class ParametarizFacebookLogin {

	@Test
	public void verifyValidLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shapbnil\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&next=https%3A%2F%2Fwww.facebook.com%2F&lwv=120&lwc=1348028");
		driver.manage().window().maximize();

		LoginPagePara login = new LoginPagePara(driver);

		login.typeUserName("shapbnil@yahoo.com");
		login.typePassWord("Rayyan13");
		login.loginButton();

		Thread.sleep(2000);

		driver.close();

	}

}
