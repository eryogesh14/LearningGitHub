package keyboard_mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard_demo {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://shelendrakumaracademy.com/web/sign-up");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement firstname=driver.findElement(By.xpath("//input[@aria-label=\"First Name\"]"));
		firstname.sendKeys("YogeshShinde");
		
		WebElement lastname=driver.findElement(By.xpath("//input[contains(@id,'-last')]"));
		
		Actions action=new Actions(driver);
		
		//click inside the text box and select the text box
		
		action.click(firstname).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		
		//copy the selected text
		
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		
		//click inside the lastname text box and paste the copied text
		
		action.click(lastname).keyDown(Keys.CONTROL).sendKeys("v").perform();

	}

}
