package testcase_2;



import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling_throgh_javascript_Executor {

	public static void main(String[] args) throws InterruptedException {
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://testautomationpractice.blogspot.com/");
       Thread.sleep(5000);
       
       JavascriptExecutor js = (JavascriptExecutor) driver; 
       
//       js.executeScript("window.scrollBy(0,400)");
       
        WebElement dragg = driver.findElement(By.id("draggable"));
        js.executeScript("arguments[0].scrollIntoView()",dragg);
        Actions ac = new Actions(driver);
        
     WebElement  s = driver.findElement(By.id("draggable"));
     WebElement d= driver.findElement(By.id("droppable"));
     Thread.sleep(3000);
     ac.dragAndDrop(s, d).build().perform();
     
	}

}
