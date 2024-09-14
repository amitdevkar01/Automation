package testcase_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Executor_sendkeys {

	public static void main(String[] args) {


		
		WebDriver driver =new ChromeDriver();
//		ChromeDriver driver =new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	WebElement textfield1 = driver.findElement(By.id("name"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','hello')",textfield1);
		
//		click on button through the javascript
		
	  WebElement button = driver.findElement(By.xpath("//button[text()='New Browser Window']"));
		
		js.executeScript("arguments[0].click();",button);
		
		
		
	}

}
