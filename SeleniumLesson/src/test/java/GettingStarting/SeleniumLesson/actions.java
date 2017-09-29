package GettingStarting.SeleniumLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class actions {
	
	@Test
	
	public void act() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSAdmin\\Desktop\\Important libraries\\Working_with_selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/?tag=geminipcabk-20&hvadid=30645237409&hvqmt=e&hvbmt=e&hvdev=c&ref=pd_sl_6zjmxhm7yi_e");
        //action class interaction we do with mouse and keyword
        WebElement e = driver.findElement(By.id("nav-link-accountList"));
        Actions a = new Actions(driver);
        //moves to specific element
        a.moveToElement(e).build().perform();
        
        WebElement e2 = driver.findElement(By.id("twotabsearchtextbox"));
        a.moveToElement(e2).click().keyDown(Keys.SHIFT).sendKeys("audi RA").keyUp(Keys.SHIFT).sendKeys(" favorite car").build().perform();
        
        
        
        
       		
	}

}
