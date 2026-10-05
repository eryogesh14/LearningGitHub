package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nested_iframe {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	    driver.get("https://shelendrakumaracademy.com/web/nested-iframe");
		driver.manage().window().maximize();
		
		//switch to parent iframe
		
		driver.switchTo().frame("parent-frame");
		
		WebElement textbox=driver.findElement(By.name("username"));
		textbox.sendKeys("Yogesh");
		
		//switch to child iframe
		
		driver.switchTo().frame("child-frame");
		WebElement emailbox=driver.findElement(By.name("email"));
		emailbox.sendKeys("abc@gmail.com");
		
		
		
		 // driver.switchTo().parentFrame(); // from child to parent iframe
		 
		 
		 
		// driver.switchTo().defaultContent();//switch to the main content
		
		
		driver.close();

	}

}
