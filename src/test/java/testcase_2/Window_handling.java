package testcase_2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Window_handling {

	public static void main(String[] args) throws InterruptedException {

     WebDriver driver = new ChromeDriver();
     driver.get("https://rahulshettyacademy.com/AutomationPractice/");
     driver.manage().window().maximize();
     Thread.sleep(3000);
      WebElement wed = driver.findElement(By.id("openwindow"));
      wed.click();

//     System.out.println(driver.getWindowHandle()); 
//     System.out.println(driver.getWindowHandles()); 
      Set<String> obj=driver.getWindowHandles();
      Iterator<String> it =obj.iterator();
      String parent_window_1 = it.next();
      String child_Window_1 =it.next();
      Thread.sleep(3000);

      
//    String child_Window_2 =it.next();   
//    String child_Window_3 =it.next();
//    String child_Window_4 =it.next();  
      
//      System.out.println(driver.getCurrentUrl());
      driver.switchTo().window(child_Window_1);   //using this method we can control multiple child 
      Thread.sleep(3000);
      System.out.println(driver.getCurrentUrl());
      driver.findElement(By.xpath("(//a[text()='Contact'])[1]")).click();
      driver.manage().window().maximize();
      
         Thread.sleep(3000);
//    First Approch Assertion

//       System.out.println(driver.getTitle());  
//      String ExpectedTitle = "QAClick Academy - A Testing Academy to Learn, Earn and Shine";
//      String actualTitle = driver.getTitle();
//     Assert.assertEquals(ExpectedTitle, actualTitle);
//        System.out.println("Test case passed");
//      
//      Second Approch Assertion
     WebElement contactbanner = driver.findElement(By.xpath("//div[@class='page-banner-cont']"));
     Assert.assertTrue(contactbanner.isDisplayed()); 
     System.out.println("Test case passed");
     
     driver.switchTo().window(parent_window_1); // control back to the parent window
     System.out.println(driver.getCurrentUrl()); 
     driver.quit();

      


      

                   
      
      
      
      
      
     
	}

}
