package faceBookPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageFactory {
	
	WebDriver driver;
	
	public LoginPageFactory(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	
	
	// How to get the WebElement = using @FindBy for locating WebElement
	
		@FindBy(how=How.XPATH, using = "//input[@type='text' and @id='email']") 
		WebElement EmailTextBox;
		
		@FindBy(id="pass")
		WebElement PasswordTextBox;
		
		@FindBy(how=How.CSS, using = "#loginbutton")
		WebElement ClickOnLogingButton;
		
		
		public void loging_facebook(String uid, String pass) {
			
			EmailTextBox.sendKeys(uid);
			PasswordTextBox.sendKeys(pass);
			ClickOnLogingButton.click();
	
		}
		
		
}
