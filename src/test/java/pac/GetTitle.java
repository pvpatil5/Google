package pac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetTitle 
{
	@Test
	public void getTitle() 
	{
		System.setProperty("webdriver.chrome.driver", "../Google/src/test/resources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);

	}	
}
