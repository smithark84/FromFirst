import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageFactory.Login;

public class FirstTestNGProper {
	WebDriver driver;
	

	@Test
  public void Gmailtest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\general\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.gmail.com");	  
		Login log = new Login(driver);
		//use methods
		log.setUserName("smithaswaroop84@gmail.com");
		log.ClickButton();
		log.close();
		Assert.assertEquals(true, true);
  }
	

}
