package SeleniumBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/selenium/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links"+links.size());
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}
		
		

	}

}
