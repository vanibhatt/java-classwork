package GettingStarting.SeleniumLesson;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Waittesting {

@Test
public void metho() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSAdmin\\Desktop\\Important libraries\\Working_with_selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    //implicit
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.get("http://www.alaskaair.com");
    //implicit wait
    
    driver.findElement(By.xpath(".//*[@id='tab-hotels']")).click();
    driver.findElement(By.xpath(".//*[@id='hotelOnlyToLocation']")).sendKeys("New York");
    driver.findElement(By.xpath(".//*[@id='hotelOnlyToLocation']")).sendKeys(Keys.TAB);
    
    
    driver.findElement(By.xpath(".//a[contains(@href, 'alaskatrips.poweredbygps.com/New-York-Hotels-Amsterdam-Court')]")).click();
    //explicit wait
    WebDriverWait d = new WebDriverWait(driver, 5);
    d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='FindHotels']")));
    driver.findElement(By.xpath(".//*[@id='FindHotels']")).sendKeys(Keys.ENTER);
    Thread.sleep(5000);
 }
}