package learningSelenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[]args) throws InterruptedException
	
	{
		System.setProperty("webdriver.driver.chromedriver","C:\\Selenium Webdriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("APjFqb")).sendKeys("Cricket");
		
		//driver.wait(5000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.className("niO4u VDgVie SlP8xc")).click();
		
	
		
		driver.findElement(By.id("icon")).click();
		
		
		 driver.findElement(By.id(""));
		 driver.findElement(By.className(""));
		 driver.findElement(By.linkText(""));
		 driver.findElement(By.partialLinkText(""));
		 driver.findElement(By.xpath("//Input[@type='text']"));
		 driver.findElement(By.cssSelector("input[type='text']"));
		 driver.findElement(By.tagName(""));
		 driver.findElement(By.name(""));
		 
		
		
	}

}
