package selenium_udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascript_alerts {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	    driver.get("https://shelendrakumaracademy.com/web/java-script-alert");
		driver.manage().window().maximize();
		
		WebElement btn=driver.findElement(By.id("jsConfirm"));
		btn.click();
		
		// driver.switchTo().alert().accept();
		
		 driver.switchTo().alert().dismiss();
		
      
	}

}
