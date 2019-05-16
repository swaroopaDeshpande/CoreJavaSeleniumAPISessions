package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import TestUtil.Constants;

public class JavaScriptExecutorUse {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", Constants.DriverExe_Chrome);
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title;").toString();
		System.out.println(title);
		js.executeScript("history.go(0)");
		// innertext of page
		String pageText = js.executeScript("return document.documentElement.innerText;").toString();
		System.out.println(pageText);
		// scrolling
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'About')]"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

}
