package POMExapmlePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public static void main(String[] args) {
		WebDriver driver ;
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\general\\Downloads\\chromedriver_win32\\chromedriver.exe");  
		 driver = new ChromeDriver();
		 LoginPageGmail logingmail = new LoginPageGmail(driver);
		 PageFactory.initElements(driver, logingmail);
		 
		

	}

}
