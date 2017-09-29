package GettingStarting.SeleniumLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class facebookaccount {

	@Test
	public void facebooka() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSAdmin\\Desktop\\Important libraries\\Working_with_selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"u_0_9\"]")).sendKeys("platform");
		driver.findElement(By.xpath("//input[@id=\"u_0_b\"]")).sendKeys("perscholas");
		driver.findElement(By.xpath("//input[@id=\"u_0_e\"]")).sendKeys("201.999.2498");
		driver.findElement(By.xpath("//input[@id=\"u_0_l\"]")).sendKeys("password123");
		
//		Select element = new Select(driver.findElement(By.xpath(".//select[@id='month']")));
//		element.selectByValue("6");
//   OR
 		driver.findElement(By.cssSelector("button[@id='month']")).click();
		
		Select element1 = new Select(driver.findElement(By.xpath(".//select[@id='day']")));
		element1.selectByValue("25");
		
		Select element2 = new Select(driver.findElement(By.xpath(".//select[@id='year']")));
		element2.selectByValue("1995");
		
		driver.findElement(By.xpath("//input[@id=\"u_0_6\"]")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
	}
}
