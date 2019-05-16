package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionClassesConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/selenium/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		// WebElement LoginBtn = driver.findElement(By.linkText("Login /
		// Signup"));
		WebElement LoginBtn = driver
				.findElement(By.xpath("//li[@class='li-login float-right']//a[contains(text(),'Login / Signup')]"));
		// WebElement Members = driver.findElement(By.linkText("SpiceClub
		// Members"));
		WebElement Members = driver.findElement(By.xpath("//a[contains(text(),'SpiceClub Members')]"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(LoginBtn));
		wait.until(ExpectedConditions.visibilityOf(Members));

		Actions action = new Actions(driver);
		action.moveToElement(LoginBtn).build().perform();
		action.moveToElement(Members).perform();
		driver.findElement(By.linkText("Sign up")).click();

	}

}
