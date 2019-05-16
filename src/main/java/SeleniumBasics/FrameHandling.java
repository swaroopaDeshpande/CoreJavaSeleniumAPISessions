package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FrameHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * That mean for example If i have 3 frames which are nested frames i1,
		 * i2, i3. If my cursor currently in i3. By using parentframe() i can
		 * reach to i2 and i can reach to i1 by using defaultcontent() –
		 * sreenath reddy Jun 30 '18 at 11:23
		 * 
		 */

		System.setProperty("webdriver.chrome.driver", "E:/selenium/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleContains("CRMPRO"));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("naveenautomation");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@123");
		WebElement submitBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", submitBtn);
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "CRMPRO");
		int size = driver.findElements(By.tagName("frame")).size();
		
		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator))
		System.out.println("No of frames present"+size);
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		

	}

}
