package amezon;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_amezon {
	
	public static void main(String[]args)
	
	{
		System.setProperty("webdriver.driver.chromedriver","C:\\Selenium Webdriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amezon.in");
		
		driver.manage().window().maximize();
		
	}

}
