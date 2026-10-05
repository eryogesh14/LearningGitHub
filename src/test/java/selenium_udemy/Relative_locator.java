package selenium_udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Relative_locator {

	public static void main(String[] args) {
       WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://shelendrakumaracademy.com/web/relative-locators");
		
		driver.manage().window().maximize();
		
		//above()
		
		WebElement loginbutton=driver.findElement(By.id("login-button"));
		
		WebElement textboxabovelogin=driver.findElement(RelativeLocator.with(By.tagName("input")).above(loginbutton));
       
		textboxabovelogin.sendKeys("Yogesh");
		
		//below ()
		
         WebElement Searchbutton=driver.findElement(By.id("search-button"));
		
		WebElement textboxbelowlogin=driver.findElement(RelativeLocator.with(By.tagName("input")).below(Searchbutton));
       
		textboxbelowlogin.sendKeys("Yogesh");
		
		//left()
		
        WebElement Submitbutton=driver.findElement(By.id("submit-button"));
		
		WebElement textboxtoleft=driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(Submitbutton));
       
		textboxtoleft.sendKeys("Yogesh");
		
		//right()
		
        WebElement filterbutton=driver.findElement(By.id("filter-button"));
		
		WebElement textboxtoright=driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(filterbutton));
       
		textboxtoright.sendKeys("Yogesh");
	}

}
