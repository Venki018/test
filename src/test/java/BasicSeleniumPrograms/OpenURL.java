package BasicSeleniumPrograms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenURL {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
      driver.get("https://www.flipkart.com/");
      Thread.sleep(2000);
      driver.get("https://www.facebook.com/");
      Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
	
		System.out.println(driver.getPageSource());
   
	}

	}


