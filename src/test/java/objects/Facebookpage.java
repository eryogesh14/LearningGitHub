package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Facebookpage {
	
	WebDriver driver;
	
	public Facebookpage(WebDriver driver)
	{
		this.driver=driver;
	}

	By user_name=By.xpath("//input[@name='email']");
	By password=By.xpath("//input[@name='pass']");
	By login_button=By.name("Log in");
	
	public void username()
	{
		driver.findElement(user_name).sendKeys("admin");
	}
	public void password()
	{
		driver.findElement(password).sendKeys("user123");
	}
	public void button()
	{
		driver.findElement(login_button).click();
		
		String title=driver.getTitle();
		
		System.out.println(title);
	}
}
