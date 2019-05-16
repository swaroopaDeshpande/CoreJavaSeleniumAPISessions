package SeleniumAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumCodingAssignment {

	public static WebDriver driver;

	@BeforeMethod
	public void setUP() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.zoopla.co.uk/");
	}

}
