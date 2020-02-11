package faceBookPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// This class will store all the locator and methods of login page

public class LoginPagePara {

	WebDriver driver;

	By username = By.id("email");
	By password = By.id("pass");
	By loginButton = By.id("loginbutton");

	public LoginPagePara(WebDriver driver) {
		this.driver = driver;

	}

	public void typeUserName(String uid) {
		driver.findElement(username).sendKeys(uid);
	}

	public void typePassWord(String pas) {
		driver.findElement(password).sendKeys(pas);
	}

	public void loginButton() {
		driver.findElement(loginButton).click();

	}

}
