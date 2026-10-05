package selenium_udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox_actions {

	public static void main(String[] args) {
		
       WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://shelendrakumaracademy.com/web/checkbox");
		
		WebElement checkbox1=driver.findElement(By.id("checkbox-python"));
		
		boolean before=checkbox1.isSelected();
		
		System.out.println(before);
		
		checkbox1.click();
		
		boolean after=checkbox1.isSelected();
		
		System.out.println(after);

	}

}
