package selenium_udemy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkLocator {
	
	public static void main(String[]args)
	{
		WebDriverManager.chromiumdriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://shelendrakumaracademy.com/web/web-links");
		
		//driver.findElement(By.linkText("Reset password")).click();
		
		driver.findElement(By.partialLinkText("Verify")).click();
		
		
		
	}

}
