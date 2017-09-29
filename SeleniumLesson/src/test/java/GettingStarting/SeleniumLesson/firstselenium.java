package GettingStarting.SeleniumLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class firstselenium {
	
	@Test
	public void firstTime() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSAdmin\\Desktop\\Important libraries\\Working_with_selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.facebook.com");
		
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys("Ahmed");
		
		driver.findElement(By.id("pass")).sendKeys("password123");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("u_0_2")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(3000);
		driver.close();
	}

}
