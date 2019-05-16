package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import TestUtil.Constants;

public class FFinHeadLessMode {

	public static void main(String[] args) {
		// FF options FF Binnary options
		// FF Binary class object created
		FirefoxBinary firefoxBinary = new FirefoxBinary();
		// addcommandlineoptions
		firefoxBinary.addCommandLineOptions("--headless");
		System.setProperty("webdriver.gecko.driver", Constants.DriverExe_FF);
		FirefoxOptions fo = new FirefoxOptions();
		fo.setBinary(firefoxBinary);
		WebDriver driver = new FirefoxDriver(fo);
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
	}

}
