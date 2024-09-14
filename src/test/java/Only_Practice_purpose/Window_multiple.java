package Only_Practice_purpose;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Window_multiple {

	public static void main(String[] args) throws InterruptedException {

      WebDriver driver= new ChromeDriver();
      driver.get("https://rahulshettyacademy.com/AutomationPractice/");
      driver.manage().window().maximize();
      Thread.sleep(3000);
      WebElement news = driver.findElement(By.id("openwindow"));
      news.click();
      
      Set<String> sut = driver.getWindowHandles();
      Iterator<String> it1= sut.iterator();
      String parentwindow_1 = it1.next();
      String child_1= it1.next();
      String child_2=it1.next();

      Thread.sleep(3000);

//      String child_3=it1.next();
      System.out.println(driver.getCurrentUrl());
      
     driver.switchTo().window(child_1);
      Thread.sleep(3000);
     System.out.println(driver.getTitle());
      driver.findElement(By.xpath("(//a[text()='Blog'])[1]")).click();
      driver.manage().window().maximize();
      Thread.sleep(3000);
//      System.out.println(driver.getCurrentUrl());
      
   System.out.println(driver.getTitle());  
  String Expected ="QAClickAcademy Blog - QAClickAcademy | Become a Test Expert";
 String actual = driver.getTitle();
 Assert.assertEquals(Expected, actual);
 System.out.println("test case Passed ");
      Thread.sleep(3000);
      
      driver.close();
//      driver.switchTo().window(original);

//      driver.switchTo().window(child_2);
//      Thread.sleep(3000);
      
//      driver.findElement(By.xpath("//a[text()='How to automate scrolling feature in  IOS/Android using Appium tool | Mobile Testing']")).click();
//      System.out.println(driver.getTitle()); 
//      


      


      
	}

}
