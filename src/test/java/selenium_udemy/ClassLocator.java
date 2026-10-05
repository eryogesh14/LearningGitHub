package selenium_udemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassLocator {
	
	public static void main(String[]args)
	{
		WebDriverManager.chromiumdriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://shelendrakumaracademy.com/web/sign-up");
		
		List<WebElement> button =driver.findElements(By.className("signup-action-btn"));
		
		System.out.println(button.size());
		
		for(WebElement buttons:button)
		{
			System.out.println(buttons.getText());
		}	
	}

}
