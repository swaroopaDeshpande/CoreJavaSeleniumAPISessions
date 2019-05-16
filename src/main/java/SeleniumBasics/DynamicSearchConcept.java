package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import TestUtil.Constants;

class DynamicSearchConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", Constants.DriverExe_Chrome);
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("Testing");
	}

}
