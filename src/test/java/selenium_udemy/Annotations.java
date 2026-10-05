package selenium_udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotations {
	
	
	@Test
	public void loginURL()
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https:www.google.com/");
		
	    String actualurl=driver.getCurrentUrl();
	    
	    String expectedurl="https://www.google.com/";
	    
	    Assert.assertEquals(actualurl, expectedurl);
	    
	   // Assert.assertNotEquals(actualurl, expectedurl);
	    
	boolean logovisibe= driver.findElement(By.className("gb_6")).isDisplayed();
	
	Assert.assertTrue(logovisibe);
	    
	    driver.close();
	
	}

}
