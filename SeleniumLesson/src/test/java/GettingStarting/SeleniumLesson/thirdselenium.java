package GettingStarting.SeleniumLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class thirdselenium {

	@Test
	public void firstTime() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSAdmin\\Desktop\\Important libraries\\Working_with_selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.facebook.com");
		System.out.println(driver.findElement(By.linkText("Forgot account?")));
		System.out.println(driver.findElement(By.id("u_0_8")).getAttribute("class"));
		
		driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(3000);
		driver.close();
	}
	
	
}
