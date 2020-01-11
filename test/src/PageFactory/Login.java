package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login {

	WebDriver driver ;
	
	@FindBy(xpath = "//input[@type = 'email']")
	WebElement UserNAME;
	
	
	@FindBy(xpath = "//span[@class = 'RveJvd snByac']")
	WebElement UserNAMEButton;	
	
	@FindBy(xpath = "//input[@name = 'password']")
	WebElement PassWord;	
	
	
	public  Login(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String UserName)
	{
		UserNAME.sendKeys(UserName);
		
	}
	public void ClickButton()
	{
		UserNAMEButton.click();
	}
	
	public void close()
	{
		//driver.close();
		this.driver.close();
	}
		

}
