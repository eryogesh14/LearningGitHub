package keyboard_mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Doubleclick {

	public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://shelendrakumaracademy.com/web/mouse-actions");
		
		driver.manage().window().maximize();
		
		WebElement btn=driver.findElement(By.id("double-click-me-button"));
		
		Actions action=new Actions(driver);
		
		//action.doubleClick(btn).perform();  //double click
		
		action.contextClick(btn).perform();    //right click

	}

}
