package selenium_udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTab {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	    driver.get("https://shelendrakumaracademy.com/web");
		driver.manage().window().maximize();

		System.out.println(driver.getCurrentUrl());
		
		//open new tab
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.google.com");
		
		
	}

}
