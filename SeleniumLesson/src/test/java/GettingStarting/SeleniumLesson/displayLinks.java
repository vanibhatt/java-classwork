package GettingStarting.SeleniumLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class displayLinks {

	@Test
	public void linktesting() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSAdmin\\Desktop\\Important libraries\\Working_with_selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.ebay.com/");
		System.out.println( driver.findElements(By.tagName("a")).size());
		
		WebElement footer = driver.findElement(By.id("glbfooter"));
		System.out.println( footer.findElements(By.tagName("a")).size());
		
		
	}
}
