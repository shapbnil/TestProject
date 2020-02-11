package faceBookPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// This class will store all the locator and methods of login page

public class LoginPage {

	WebDriver driver;

	By username = By.id("email");
	By password = By.id("pass");
	By loginButton = By.id("loginbutton");

	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	public void typeUserName() {
		driver.findElement(username).sendKeys("shapbnil@gmail.com");
	}

	public void typePassWord() {
		driver.findElement(password).sendKeys("Safwan07");
	}

	public void loginButton() {
		driver.findElement(loginButton).click();

	}

}
