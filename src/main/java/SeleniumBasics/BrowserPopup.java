package SeleniumBasics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import TestUtil.Constants;

public class BrowserPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", Constants.DriverExe_Chrome);
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #4')]")).click();
		Set<String> Windows=driver.getWindowHandles();
		Iterator<String> it=Windows.iterator();
		String parentID=it.next();
		System.out.println(parentID);
		String childId=it.next();
		System.out.println(childId);
		driver.switchTo().window(childId);
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
		driver.switchTo().window(parentID);		
		String title1=driver.getTitle();
		System.out.println(title1);	
	}

}
