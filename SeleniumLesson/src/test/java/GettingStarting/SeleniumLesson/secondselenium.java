package GettingStarting.SeleniumLesson;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class secondselenium {

	@Test
	public void facebookAuto() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSAdmin\\Desktop\\Important libraries\\Working_with_selenium\\chromedriver_win32\\chromedriver.exe");
//		System.setProperty(" ", " ");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.facebook.com");
		
		Select element = new Select(driver.findElement(By.xpath(".//select[@id='month']")));
		element.selectByValue("5");	
        
	}
	
}
