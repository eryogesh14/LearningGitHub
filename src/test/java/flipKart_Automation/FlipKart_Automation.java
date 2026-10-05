package flipKart_Automation;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipKart_Automation {
	
	
	public static void main(String[]args){
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		/*Edge
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		*/
		
		
		/* firefox
		 
		 WebDriverManager.firefoxdriver().setup();
         WebDriver driver = new FirefoxDriver();
		*/
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		
		
		
		//open flipkart
		
		driver.get("https://www.flipkart.com");
		
		
		
		
		  // Close login popup if displayed
		
		try {
			
			WebElement closeButton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'✕')]")));
			
			closeButton.click();
		}
		catch(Exception e){
			
			System.out.println("Login pop up is not displayed");
		}
		
		
		
		 // Search for an item
		
		WebElement SearchBox=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		
		SearchBox.sendKeys("iPhone 15");
		SearchBox.sendKeys(Keys.ENTER);
		
		
		
		 // Click first product
		
		List<WebElement> results = findSearchResults(driver, wait);

        if (results.isEmpty()) {
            takeScreenshot(driver, "no_results_debug.png");
            throw new RuntimeException("No search results found for: " );
        }

        String firstProductWindow = driver.getWindowHandle();
        results.get(0).click();
		
		
		 // Switch to new tab
		
		String parent=driver.getWindowHandle();
		
		Set<String>windows=driver.getWindowHandles();
		
		for(String window : windows) {
			
			if(!window.equals(parent)) {
				
				
				   driver.switchTo().window(window);
				   
				   break;
				}
		}
		
		
	    // Click Add to Cart
		
		WebElement AddtoKart=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Add to cart')]")));
		
		AddtoKart.click();
		
		System.out.println("Item added successfully");
		
		driver.quit();
		
		
		
		
		
	}

	private static void takeScreenshot(WebDriver driver, String string) {
		// TODO Auto-generated method stub
		
	}

	private static List<WebElement> findSearchResults(WebDriver driver, WebDriverWait wait) {
		// TODO Auto-generated method stub
		return null;
	}

}
