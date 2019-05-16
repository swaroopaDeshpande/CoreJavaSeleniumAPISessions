package SeleniumBasics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.restassured.http.Cookie;

public class CookiesHandlingConcept {

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(
				"C:/Users/HP/workspace/JavaSeleniumAPIPracticeSessions/src/main/java/config.properties");
		;
		prop.load(ip);
		System.setProperty(prop.getProperty("keyDriver"), prop.getProperty("browserexePath"));
		// new DesiredCapabilities();
		// DesiredCapabilities capabilities=DesiredCapabilities.chrome();
		// capabilities.getClass();
		// capabilities.setJavascriptEnabled(true);
		// capabilities.getPlatform();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");
		driver.findElement(By.name("username")).sendKeys("abc123");
		driver.findElement(By.name("password")).sendKeys("123xyz");
		driver.findElement(By.name("submit")).click();
		// create file named Cookies to store Login Information
		File file = new File("Cookies.data");
		try {
			file.delete();
			file.createNewFile();
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter Bwrite = new BufferedWriter(fileWriter);
			for (org.openqa.selenium.Cookie ck : driver.manage().getCookies()) {
				Bwrite.write((ck.getName() + ";" + ck.getValue() + ";" + ck.getDomain() + ";" + ck.getPath() + ";"
						+ ck.getExpiry() + ";" + ck.isSecure()));
				Bwrite.newLine();
			}
			Bwrite.close();
			fileWriter.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
