package spectrumPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SpectrumLoginPage {
	
	WebDriver driver;
	
	public SpectrumLoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	@FindBy(how=How.ID, using="cc-username")
	WebElement username;
	
	@FindBy(css="#cc-user-password")
	WebElement password;
	
	@FindBy(xpath="//span[@class='kite-custom-control-indicator']")
	WebElement remember;
	
	@FindBy(xpath="//button[@class='kite-btn kite-btn-lg kite-btn-primary kite-btn-light dialog_button']")
	WebElement signin;
	
	
	public void spectrum_login(String uid, String pass) {
		
		username.sendKeys(uid);
		password.sendKeys(pass);
		remember.click();
		signin.click();
	}
	

}
