package selenium_udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button_actions {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://shelendrakumaracademy.com/web/button");
		
		WebElement button=driver.findElement(By.id("click-me-button"));
		
		boolean isEnabled= button.isEnabled();   //enabled or not
		
		System.out.println(isEnabled);
		
		String btnText=button.getText();    //get text
		
		System.out.println(btnText);
		
		button.click();

	}

}
