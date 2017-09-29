package GettingStarting.SeleniumLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class moreframe {
	
	@Test
	public void framenumber() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSAdmin\\Desktop\\Important libraries\\Working_with_selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://fantasycricket.dream11.com/IN/");
	
	int number = findFramenumber(driver,By.xpath(".//[@id='recaptach-anchor']/div[5]"));
	driver.switchTo().frame(number);
	driver.findElement(By.xpath(".//[@id='recaptach-anchor']/div[5]")).click();
	driver.switchTo().defaultContent();
	
	int number1 = findFramenumber(driver,By.xpath("//*[@id='recaptcha-verify-button']"));
	driver.switchTo().frame(number1);
	driver.findElement(By.xpath("//*[@id='recaptcha-verify-button']")).click();
	
	}

  public static int findFramenumber (WebDriver driver, By by) {
	  int i;
	  int framecount=driver.findElements(By.tagName("iframe")).size();
	  
	  for(i=0;i<framecount;i++) {
		  driver.switchTo().frame(i);
		  int count=driver.findElements(by).size();
		  
		  if(count>0) {
			  break;}
		  else {
			  System.out.println("continue looping");
		  }
	  }
		  
	  driver.switchTo().defaultContent();
	  return i;
	  
  }
}