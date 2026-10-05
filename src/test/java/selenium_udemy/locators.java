package selenium_udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.driver.chromedriver","C:\\Selenium Webdriver.exe");
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.className("x1ja2u2z x78zum5 x2lah0s x1n2onr6 xl56j7k x6s0dn4 xozqiw3 x1q0g3np x9f619 x1qhmfi1 x12ezzi8 xk7q072 x7uw254 x1xjjfxs x13fuv20 x18b5jzi x1q0q8m5 x1t7ytsu x178xt8z x1lun4ml xso031l xpilrb4 xqbgfmv xbe3n85 x7a1id4 x1d9i5bo x1xila8y x1bumbmr xc8cyl1")).click();
        
		driver.findElement(By.id("_r_7_")).sendKeys("John");
		
		driver.findElement(By.id("_r_a_")).sendKeys("Kamble");
		
		
	}

}
