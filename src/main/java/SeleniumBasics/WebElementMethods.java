package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/selenium/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/register/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		WebElement submitBtn = driver.findElement(By.id("submitButton"));
		boolean flag = submitBtn.isDisplayed();
		System.out.println(flag);// true
		// waitTillVisibility(driver, 30, submitBtn);
		System.out.println(submitBtn.isEnabled());// false
		WebElement checkBox = driver.findElement(By.name("agreeTerms"));
		System.out.println(checkBox.isSelected());// false
		checkBox.click();
		System.out.println(checkBox.isSelected());// true
		System.out.println(submitBtn.isEnabled());// true

	}

	public static void waitTillVisibility(WebDriver driver, int time, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
