package SeleniumBasics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepositoryConcept {

	public static void main(String[] args) throws IOException {
		// 1.create object of properties class

		Properties prop = new Properties();
		// 2.create object FileInputStream class+add path of config file
		FileInputStream ip = new FileInputStream( "C:\\Users\\HP\\workspace\\JavaSeleniumAPIPracticeSessions\\src\\main\\java\\config.properties");
		// 3.load properties
		prop.load(ip);
		// 4.access properties
		System.setProperty(prop.getProperty("keyDriver"), prop.getProperty("browserexePath"));
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}

}
