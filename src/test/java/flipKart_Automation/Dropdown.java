package flipKart_Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	
	public static void main(String[]args)
	
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		  // Implicit Wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Explicit wait
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//dropdown with select tag
		
		WebElement staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		 Select dropdown=new Select(staticdropdown);
		 
		 dropdown.selectByIndex(3);
		 
		 System.out.println(dropdown.getFirstSelectedOption().getText()); // to get the text of first selected item
		 
		 dropdown.selectByVisibleText("AED");
		 
		 System.out.println(dropdown.getFirstSelectedOption().getText());
		 
		dropdown.selectByValue("INR");	
		
		 System.out.println(dropdown.getFirstSelectedOption().getText());
		 
		 //static dropdown
		
		 driver.findElement(By.id("divpaxinfo")).click();
		 
		/* int i=1;
		              to select multiple adults , we use loop 
		 while(i<5)
		 {
			 driver.findElement(By.id("hrefIncAdt")).click();
			 
			 i++;
			 
		 }
		 */
		 
		 System.out.println( driver.findElement(By.id("divpaxinfo")).getText()); // get the text before select multiple adults
		 
		        for(int i=1;i<5;i++)
		        {
		         driver.findElement(By.id("hrefIncAdt")).click();
		        }
		        
		 driver.findElement(By.id("btnclosepaxoption")).click();
		
		System.out.println( driver.findElement(By.id("divpaxinfo")).getText()); // get the text after selecting multiple adults
		
		//Dynamic dropdown
		
		//(//a[@value='MAA'])[2]
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		driver.quit();
	}

}
