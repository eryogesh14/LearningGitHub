package selenium_udemy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMtestcase {
	
	WebDriver driver;
	
	@Test(priority=1)
	public void logintestcase()
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("Learning@830$3mK2");
		driver.findElement(By.className("checkmark")).click();
		driver.findElement(By.className("form-control")).click();
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
	}
	
	@Test(priority=2)
	public void gettitle()
	{
		String title=driver.findElement(By.className("navbar-brand")).getText();
		System.out.println(title);
		
	}
	
	@Test(priority=3)
	public void checkout ()
	{
		driver.findElement(By.className("nav-link btn btn-primary")).click();
	}
	
	
}
