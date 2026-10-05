package naukri;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	WebDriver driver;
	
    @BeforeMethod
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("https://www.naukri.com ");
	}
	
	//verify login page title
    @Test(priority=1)
	public void loginpagetitle()
	{
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		Assert.assertTrue(actualtitle.toLowerCase().contains("naukri"),"Title does not contain Naukri");	
	}
	
    //verify blank username
    @Test(priority=2)
	public void blankusername()
	{
		driver.findElement(By.id("login_Layer")).click();	
	}
	

}
