package selenium_udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSLocator {
	
	public static void main(String[]args)
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://shelendrakumaracademy.com/web/buttons-with-messages");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#css-id-save-btn")).click();  //using ID
		
		driver.findElement(By.cssSelector(".status-btn")).click();       //using class
		
		driver.findElement(By.cssSelector("button[data-action='css-attr-apply']")).click(); //using attribute
		
		driver.findElement(By.cssSelector("button[type=\"button\"][data-tier=\"css-multi-premium\"]")).click(); //using multiple attributes
		
	}

}
