package selenium_udemy;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_flow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 16");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
		Map<Character,Integer>count=new HashMap<>();
		
		
		for(char c:title.toCharArray())   // to convert string to array
		{
			 count.put(c, count.getOrDefault(c, 0) + 1);
		}
		System.out.println(count);
	}

}
