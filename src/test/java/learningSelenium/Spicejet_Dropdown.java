package learningSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Spicejet_Dropdown {
	
	public static void main(String[]args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.className("css-1dbjc4n r-1loqt21 r-18u37iz r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr")).click();
		
		
	}

}
