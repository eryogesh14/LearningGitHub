package selenium_udemy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calander_actions {

	public static void main(String[] args) {
		
       WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://shelendrakumaracademy.com/web/calendar/");
		
        driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement depart=driver.findElement(By.id("departure"));
		
		depart.click();
		
		WebElement nxtbutton=driver.findElement(By.xpath("//button[@aria-label='Go to the Next Month']"));
		
		nxtbutton.click();
		
		WebElement firstdate=driver.findElement(By.xpath("//button[@aria-label='Sunday, November 1st, 2026, selected']"));
		
		firstdate.click();

	}

}
