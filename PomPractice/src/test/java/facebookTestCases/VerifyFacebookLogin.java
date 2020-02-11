package facebookTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import faceBookPages.LoginPage;

public class VerifyFacebookLogin {

	@Test
	public void verifyValidLogin() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shapbnil\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&next=https%3A%2F%2Fwww.facebook.com%2F&lwv=120&lwc=1348028");
		driver.manage().window().maximize();

		LoginPage login = new LoginPage(driver);

		login.typeUserName();
		login.typePassWord();
		login.loginButton();

		driver.close();

	}

}
