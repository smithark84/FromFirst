package PageFactoryTest;
//import  FirstTESTNG.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.Login;

public class LoginTest {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\general\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.gmail.com");
		Login log = new Login(driver);
		
		//use methods
		log.setUserName("smithaswaroop84@gmail.com");
		log.ClickButton();
		
		
		
		
		
	}

}
