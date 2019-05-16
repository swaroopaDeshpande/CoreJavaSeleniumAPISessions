package SeleniumSessionsUsingTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementExceptionTest {

	public static WebDriver driver;

	@BeforeMethod
	public void setUP() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}
	
	@Test
	public void StaleElementErrTest()
	{
		String str=driver.getTitle();
		System.out.println(str);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		driver.navigate().refresh();
		List<WebElement> links1=driver.findElements(By.tagName("a"));

		System.out.println(links1);
		for(int i=0;i<links.size();i++)
		{
//			links.get(i).getAttribute("InnerText");
			links1.get(i).getText();
		}
		
	
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
