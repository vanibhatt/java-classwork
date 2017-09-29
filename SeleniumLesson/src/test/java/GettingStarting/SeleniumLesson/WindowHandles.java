package GettingStarting.SeleniumLesson;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandles {

	@Test
	public void googlehandle() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSAdmin\\Desktop\\Important libraries\\Working_with_selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?hl=en&passive=true&continue=https%3A%2F%2Fwww.google.com%2F&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[contains(@href,'https://support.google.com/accounts?hl=en')]")).click();
		System.out.println(driver.getTitle());
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		
		Iterator iter = windows.iterator();
		String firstw = null;
		String secondw = null;
		firstw = (String) iter.next();
		secondw = (String) iter.next();
		
		driver.switchTo().window(secondw);
		System.out.println(driver.getTitle());
	}
}
