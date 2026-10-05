package objects;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class GoogleSearchpage {
		
		WebDriver driver;
		
		public GoogleSearchpage(WebDriver driver) //constructor 
		{
			this.driver=driver;	
		}
		
		By searchBox=By.id("ti6dpd");
		By seachbutton=By.xpath("(//input[@name='btnK'])[1]");
		By facebook_link=By.xpath("//a//h3[text()='Facebook - log in or sign up']");
		
		public void searchgoogle(String searchinput)
		{
			try 
			{
				driver.findElement(searchBox).sendKeys(searchinput);
				Thread.sleep(2000);
				driver.findElement(seachbutton).click();
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println("exception caught"+ e.getMessage());
			}	
		}
		
		public void clickFacbook()
		{
			try
			{
				driver.findElement(facebook_link).click();
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println("exception caught"+ e.getMessage());
			}
			
		}
		

	}


