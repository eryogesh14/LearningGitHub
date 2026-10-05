package common.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Page_Information {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	    driver.get("https://shelendrakumaracademy.com/web");
		driver.manage().window().maximize();
		
		//get page title
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().minimize();
		//get current URL
		
		WebElement textboxLink=driver.findElement(By.linkText("Text box"));
		
		textboxLink.click();
		
		driver.manage().window().fullscreen();
		
	    String currentURL=driver.getCurrentUrl();
		System.out.println(currentURL);
		Thread.sleep(5);
		driver.navigate().back();
		Thread.sleep(5);
		driver.navigate().forward();
		Thread.sleep(5);
		driver.navigate().refresh();

	}

}
