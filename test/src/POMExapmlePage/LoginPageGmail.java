package POMExapmlePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPageGmail {
	WebDriver driver ;
	
	@FindBy(xpath = "//input[@type = 'email']")
	WebElement UserName1;
	By UserName = By.xpath("//input[@type = 'email']");
	By PassWord = By.xpath("//input[@name = 'password']");
	By NextButtonUser = By.xpath("//span[@class = 'RveJvd snByac']");
	By NextButtonPass = By.xpath("//span[@class= 'CwaK9']");
	
	
	public void UserNameS(String Username)
	{
		UserName1.sendKeys(Username);
	}
	
	public LoginPageGmail(WebDriver driver)
	{
		this.driver = driver;
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\general\\Downloads\\chromedriver_win32\\chromedriver.exe");  
//		WebDriver driver = new ChromeDriver();
	}
	
	public void UserName(String User)
	{
		
		driver.findElement(UserName).sendKeys(User);
	}
	
	public void ClickNextbuttonUser()
	{
		driver.findElement(NextButtonUser).click();
	}
	
	public void Password(String Password)
	{
		
		driver.findElement(PassWord).sendKeys(Password);
	}
	
	public void ClickNextbuttonPassword()
	{
		driver.findElement(NextButtonPass).click();
	}
	
	public void ImplicitWait(int Time)
	{
		
		driver.manage().timeouts().implicitlyWait(Time, TimeUnit.SECONDS);
	}
	
	//Methods
	
	public void LoginUser(String User, String Password)
	{
		
		this.UserName(User);
		this.ClickNextbuttonUser();
		this.ImplicitWait(50);
		this.Password(Password);
		this.ClickNextbuttonPassword();
		this.ImplicitWait(50);
	}
}
