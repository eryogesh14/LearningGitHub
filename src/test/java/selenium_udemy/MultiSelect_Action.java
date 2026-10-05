package selenium_udemy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelect_Action {
	
public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://shelendrakumaracademy.com/web/drop-down/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement skills=driver.findElement(By.id("skills"));
		
		Select MultiDropdown=new Select(skills);
		
		MultiDropdown.selectByVisibleText("Java");
		MultiDropdown.selectByVisibleText("TestNG");
		MultiDropdown.selectByVisibleText("Python");
		
		//get all selected options
		
		List<WebElement>item=MultiDropdown.getAllSelectedOptions();
		
		for(WebElement element:item)
		{
			System.out.println(element.getText());
		}

}
}
