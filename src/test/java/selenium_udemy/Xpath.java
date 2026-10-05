package selenium_udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {
	
	public static void main(String[]args)
	{
		WebDriverManager.chromiumdriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://shelendrakumaracademy.com/web/sign-up");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@aria-label='First Name']")).sendKeys("Yogesh");
		
		driver.findElement(By.xpath("//input[contains(@id,'-last')]")).sendKeys("Shinde");
		
		driver.findElement(By.xpath("//input[starts-with(@name,'email')]")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.xpath("//div[@id=\"username-field\"]/child::input")).sendKeys("Yogesh123");
		
	}

}
