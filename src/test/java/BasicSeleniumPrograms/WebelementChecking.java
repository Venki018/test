
package BasicSeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebelementChecking {
public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		// find ele by x path
		WebElement ele = driver.findElement(By.xpath("//input[@name='username']"));
	boolean value=ele.isDisplayed();
	System.out.println(value);
if(value) {
	System.out.println("Element displayed");
}
else {
	System.out.println("Not displayed");
}
//isenabled or not
//Check box selected or not isselected or not
// clear method
// clear without using clear method
   //sendkeys(keys.CONTROL+"A");
   //sendkeys(keys.delete);
//click without click
   // sendkeys(keys.Enter);
//copy paste values from text boxes control+"c" and(delete data first) control+"V"
// Print the element
     //first find element  .gettext method save the data in variables
     //sopln(variable u saved)
//variable.getattribute()
//variable.getlocation()
//variable.get X & get Y
//variable.get cssvalue("font-size");

// for get alternate is navigate to (syntax=navigate().to,.forward,.backward,refresh etc...
}}
