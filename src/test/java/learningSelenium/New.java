package learningSelenium;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class New {
	
	public static void main(String[]args) 
	
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.visibilityOf(null));
		
		
		
		Alert alert=driver.switchTo().alert();  //Alert is a interface
		
		alert.accept();
		alert.dismiss();
		alert.getText();
		alert.sendKeys(null);
		
		
		Actions act=new Actions(driver);  // used to perform mouse actions
		
		act.moveToElement(null).perform();
		
		act.moveToElement(null).click();
		
		act.moveToElement(null).clickAndHold();
		
		//act.dragAndDrop(source,destination).perform();
		
		
	   //   Select s =new Select(element);  // used to handle dropdown
	      
	/*     TakesScreenshot s =(TakesScreenshot)driver();
	     
	     File source=s.getScreenshotAs(OutputType.FILE);
	     File destination =new File();
	     FileHandler.copy(source, destination);
	*/	
		
		
		
	}

}
