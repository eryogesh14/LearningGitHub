package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait_Demo {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://shelendrakumaracademy.com/web/synchronization");
		
		driver.manage().window().maximize();
		
		
		WebElement loaduserbtn=driver.findElement(By.id("load-user-profile-button"));
		
		loaduserbtn.click();
		
		//Thread.sleep(Duration.ofSeconds(10));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement message=driver.findElement(By.id("implicit-wait-result"));
		
		System.out.println(message.getText());

	}

}
