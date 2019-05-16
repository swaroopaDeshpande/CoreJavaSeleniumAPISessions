package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.log4testng.Logger;

public class DropDownHandling {

	public static void main(String[] args) {
		Logger log = Logger.getLogger(DropDownHandling.class);

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		String dob = "10-May-2010";
		String dobArr[] = dob.split("-");
		selectValueByDay(day, dobArr[0]);
		selectValueByDay(month, dobArr[1]);
		selectValueByDay(year, dobArr[2]);

	}

	public static void selectValueByDay(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

}
