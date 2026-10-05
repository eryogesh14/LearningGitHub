package selenium_udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton_action {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://shelendrakumaracademy.com/web/radio-button");
		
		WebElement radiobutton=driver.findElement(By.id("radio-beginner"));
		
		radiobutton.click();
		
		boolean isSelected=radiobutton.isSelected();
		
		System.out.println(isSelected);
		
		

	}

}
