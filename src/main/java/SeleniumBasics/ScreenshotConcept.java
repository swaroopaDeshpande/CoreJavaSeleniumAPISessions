package SeleniumBasics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotConcept {

	public static void main(String[] args) throws IOException {
		// getscreenshotas --topcasting driver to takescreenshot class
		System.setProperty("webdriver.chrome.driver", "E:/selenium/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("C:/Users/HP/workspace/JavaSeleniumAPIPracticeSessions/Screenshots/google.png"));
	}

}
