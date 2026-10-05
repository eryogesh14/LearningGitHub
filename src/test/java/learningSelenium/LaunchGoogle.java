package learningSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGoogle {

	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.driver.chromedriver","C:\\Selenium Webdriver.exe");

		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.close();
		
	
	}

}
