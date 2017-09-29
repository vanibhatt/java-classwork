package GettingStarting.SeleniumLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ManualAutomation {
	
	@Test
	public void menu() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSAdmin\\Desktop\\Important libraries\\Working_with_selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.spicejet.com");
//		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
//		driver.findElement(By.linkText("Gorakhpur (GOP)")).click();
//		driver.findElement(By.xpath(".//a[@text='Bagdogra (IXB)']")).click();
		
//		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_1']")).click();
//		System.out.println(driver.findElements(By.id("ctl00_mainContent_txt_Todate")).size());
		
		
		Select element = new Select(driver.findElement(By.xpath(".//select[@id='ctl00_mainContent_ddl_Adult']")));
		element.selectByValue("8");	
		
		Select element1 = new Select(driver.findElement(By.xpath(".//select[@id='ctl00_mainContent_ddl_Child']")));
		element1.selectByValue("4");
		
		Select element2 = new Select(driver.findElement(By.xpath(".//select[@id='ctl00_mainContent_ddl_Infant']")));
		element2.selectByValue("5");
	}
}
