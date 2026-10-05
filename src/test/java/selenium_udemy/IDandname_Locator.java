package selenium_udemy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IDandname_Locator {
	
	public static void main(String[]args)
	{
		WebDriverManager.chromiumdriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://shelendrakumaracademy.com/web/text-box");
		
		driver.findElement(By.id("email-input")).sendKeys("eryogesh.sh@gmail.com");
		
		driver.findElement(By.name("get_password")).click();
		
		
	}

}
