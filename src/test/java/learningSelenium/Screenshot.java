package learningSelenium;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {
	
	public static void main(String[]args)
	{
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		TakesScreenshot screenshot=((TakesScreenshot)driver.getScreenshotAs(OutputType.FILE));
		
		File destination=new File(" google_homepage.png ");
		
		
		
		
	
	}

}
