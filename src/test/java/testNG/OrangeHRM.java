package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
	
	WebDriver driver;
	
	@Test
	public void loginID()
	{
		String actualtitle="OrangeHRM";
		String expectedtitle="OrangeHRM";
		Assert.assertEquals(actualtitle, expectedtitle);
	}

	@BeforeMethod
	public void driver()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String title=driver.getTitle();
		
		String expectedtitle="OrangeHRM";
		
		Assert.assertEquals(title, expectedtitle);
		
		System.out.println("execution is successful");
		
		String verifytitle=driver.findElement(By.name("name")).getText();
		
		System.out.println(verifytitle);
		
		
		
	}
	
	
	
}
