package keyboard_mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mousehover {

	public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://shelendrakumaracademy.com/web/mouse-actions");
		
		driver.manage().window().maximize();
		
		WebElement movebutton=driver.findElement(By.id("mouse-hover-trigger"));
		
		Actions actions=new Actions(driver);
		
		actions.moveToElement(movebutton).perform();

	}

}
