package selenium_udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table_actions {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://shelendrakumaracademy.com/web/web-table");
		
		WebElement employee=driver.findElement(By.xpath("//td[text()='Sara Lee']"));
		
		System.out.println(employee.isDisplayed());

	}

}
