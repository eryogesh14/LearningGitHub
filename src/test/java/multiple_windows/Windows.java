package multiple_windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	    driver.get("https://shelendrakumaracademy.com/web/multiple-windows");
		driver.manage().window().maximize();
		
		String currentid=driver.getWindowHandle();
		
		System.out.println(currentid);
		
		WebElement button=driver.findElement(By.className("open-window-button"));
		button.click();
		
		Set<String>WindowIDs=driver.getWindowHandles();
		System.out.println(WindowIDs);
		
		for(String s:WindowIDs)
		{
			if(!s.equalsIgnoreCase(currentid))
			{
				driver.switchTo().window(s);
				break;
			}
		}
		
		driver.findElement(By.id("close-window-button")).click();
	}

}
