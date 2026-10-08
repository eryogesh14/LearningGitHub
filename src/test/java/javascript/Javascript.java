package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascript {
	
	public static void main(String[]args)
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://shelendrakumaracademy.com/web/javascript-executor");
		
		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.id("js-executor-text-input"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].value='Yogesh';", element);
		
		//click
		
		WebElement button=driver.findElement(By.className("js-executor-button"));
		
		js.executeScript("arguments[0].click();", button);
		
		
		
		
		
		
		
	}
	

}
