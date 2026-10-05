package test_scenarios;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objects.Facebookpage;
import objects.GoogleSearchpage;

public class GoogleSearch_TestMethod {
WebDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
	    WebDriverManager.chromedriver().setup();
	    
	    driver=new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get("https://www.google.com/");
	}
	
	@Test(priority=0)
	public void searchoperation() 
	{
		GoogleSearchpage page =new GoogleSearchpage(driver);
		page.searchgoogle("facebook");	
	}
	@Test (priority=1)
	public void verifyandaccessfacebook()
	{
		GoogleSearchpage page=new GoogleSearchpage(driver);
		page.clickFacbook();
	}
	@Test (priority=2)
	public void verifyLogin()
	{
		Facebookpage page=new Facebookpage(driver);
		page.username();
		page.password();
		page.button();
		
	}
	
	@AfterTest
	public void aftertest()
	{
		driver.quit();
	}
	


}
