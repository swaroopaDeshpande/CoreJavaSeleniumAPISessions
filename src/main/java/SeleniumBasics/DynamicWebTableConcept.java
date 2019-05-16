package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestUtil.Constants;

public class DynamicWebTableConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", Constants.DriverExe_Chrome);
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://classic.crmpro.com/index.html");
		driver.findElement(By.name("username")).sendKeys("naveenautomation");
		driver.findElement(By.name("password")).sendKeys("Test@123");
		WebElement submitBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", submitBtn);
		driver.switchTo().frame("mainpanel");
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mainpanel"));
		WebElement contact = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		contact.click();
		String before_Xpath="//*[@id='vContactsForm']/table/tbody/tr[";
		String after_Xpath="]/td[2]/a";
		
	}

}
