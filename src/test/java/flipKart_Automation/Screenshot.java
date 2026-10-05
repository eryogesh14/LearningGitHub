package flipKart_Automation;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	
	public static void main(String[]args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		
		
		 driver.get("https://www.flipkart.com");
		 
		 
		 //capture screenshot
		 
		 TakesScreenshot ts= (TakesScreenshot) driver;
		 
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 
		 String timestamp=LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMyyyy_HHmm"));
		 
		 File Destination= new File("C:\\Users\\eryog\\Desktop\\Yogesh\\selenium + timestamp + \".png");
		 
		 FileHandler.copy(source, Destination);
		 
		 System.out.println("screenshot captured successfully");
		 
		 driver.quit();
		 
		 
		
		
		
	}

}
