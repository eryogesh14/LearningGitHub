package selenium_udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_actions {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://shelendrakumaracademy.com/web/drop-down/");
		
		driver.manage().window().maximize();
		
		WebElement JobTitle=driver.findElement(By.id("jobTitle"));
		
		Select dropdown=new Select(JobTitle);
		
		//dropdown.selectByVisibleText("Engineering");
		//dropdown.selectByValue("Help Desk");
		dropdown.selectByIndex(5);
		
		WebElement getFirstselected=dropdown.getFirstSelectedOption();
		
		System.out.println(getFirstselected.getText());
		

	}

}
