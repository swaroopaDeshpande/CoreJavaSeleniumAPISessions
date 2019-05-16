package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileBrowserPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/selenium/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.html.com/input-type-file/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\HP\\Desktop\\brahmakumari.txt");
		
	}

}
