package selenium_udemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagLocator {
	
	public static void main(String[]args)
	{
		WebDriverManager.chromiumdriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://shelendrakumaracademy.com/web");
		
		List<WebElement>allLinks=driver.findElements(By.tagName("a"));
		
		System.out.println(allLinks.size());
		
		
		
		
		
	}

}
