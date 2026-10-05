package selenium_udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextBox_Actions {
	
	public static void main(String[]args)
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://shelendrakumaracademy.com/web/text-box");
		
		WebElement emailTextBox=driver.findElement(By.name("user_email"));
		
		emailTextBox.sendKeys("abc@gmail.com");
		
		String value_textBox=emailTextBox.getAttribute("value");
		
		System.out.println(value_textBox);
		
		emailTextBox.clear();
		
		driver.quit();
		
		
		
	}

}
