package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		// simulate back and fwd btn of browser
		System.setProperty("webdriver.chrome.driver", "E:/selenium/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.navigate().to("http://www.amazon.com");
		driver.navigate().back();
		driver.navigate().forward();
		System.out.println(driver.getTitle());

	}

}
