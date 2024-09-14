package testcase_2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_end_of_Page {

	public static void main(String[] args) throws InterruptedException {

      WebDriver driver = new ChromeDriver();
      driver.get("https://testautomationpractice.blogspot.com/");
      driver.manage().window().maximize();
      Thread.sleep(2000);
      
      JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
      
      Thread.sleep(5000);
      js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
      
	}

}
