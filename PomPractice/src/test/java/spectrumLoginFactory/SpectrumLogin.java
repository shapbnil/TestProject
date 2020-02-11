package spectrumLoginFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import spectrumPage.SpectrumLoginPage;


public class SpectrumLogin {
	
	@Test
	public void spectrumLoginPage() {
		
		//1. Initialize driver
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shapbnil\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//This will launch browser and specific url
		driver.get("https://www.spectrum.net/login");
		
		//This will Maximize the Browser
		driver.manage().window().maximize();
		
				
		//Created Page Object using Page Factory

		SpectrumLoginPage login_page=PageFactory.initElements(driver, SpectrumLoginPage.class);
		
		
		//Call the Method
		login_page.spectrum_login("shapbnil", "Safwan07");

		driver.close();

	}

}
