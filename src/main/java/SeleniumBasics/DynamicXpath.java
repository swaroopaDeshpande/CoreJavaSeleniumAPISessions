package SeleniumBasics;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DynamicXpath {

	public static void main(String[] args) {
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
		driver.switchTo().frame("mainpanel");
		WebElement contactsLink=driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
//		WebElement newContactLinks=driver.findElement(By.xpath("//a[contains(text(),'New Contact')]"));
//		Actions action = new Actions(driver);
		wait.until(ExpectedConditions.elementToBeClickable(contactsLink));
//		action.clickAndHold(contactsLink).build().perform();
//		newContactLinks.click();
		contactsLink.click();
		
		
		
		
		
	}

}
