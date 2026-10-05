package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe_demo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	    driver.get("https://shelendrakumaracademy.com/web/iframe");
		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.id("dialog-text-field"));
		element.sendKeys("Yogesh");
		
		//close dialog box
		
		driver.switchTo().frame("dialog-embed-frame");
		
		WebElement closeButton=driver.findElement(By.id("dialog-close-button"));
        closeButton.click();
        
        driver.switchTo().defaultContent();
        element.clear();
	}

}
