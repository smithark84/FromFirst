package WebDriverPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstWebDriver {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\general\\Downloads\\chromedriver_win32\\chromedriver.exe");  
		 WebDriver driver = new ChromeDriver();
		 driver.navigate().to("http://www.gmail.com");
		System.out.println(driver.getTitle()); 
		 String Emailtxt = driver.findElement(By.xpath("//input[@type = 'email']")).getAttribute("aria-label");
		 System.out.println(Emailtxt);
		 driver.findElement(By.xpath("//input[@type = 'email']")).sendKeys("smithaswaroop84@gmail.com");
		 driver.findElement(By.xpath("//span[@class = 'RveJvd snByac']")).click();
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("08025702069");
		 driver.findElement(By.xpath("//span[@class= 'CwaK9']")).click();
		// driver.findElement(By.id("identifierId")).sendKeys("test");
		 WebDriverWait wd = new WebDriverWait(driver,60);
		 wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title = 'Inbox']")));
		 List<WebElement> Elements1 = driver.findElements(By.xpath("//table[@class = 'F cf zt'  and @id = ':2t']/tbody/tr"));
		 System.out.println(Elements1.size());
		 List<WebElement> Col = driver.findElements(By.xpath("//table[@class = 'F cf zt'  and @id = ':2t']/tbody/tr[1]/td"));
		 System.out.println(Col.size());
		 
		 
	}
}
