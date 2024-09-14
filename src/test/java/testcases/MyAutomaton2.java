package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyAutomaton2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.javatpoint.com/collections-in-java");
        Thread.sleep(3000);
        driver.manage().window().maximize();
         System.out.println( driver.getCurrentUrl()); 
        Thread.sleep(3000);
      System.out.println("Title for First page ="+driver.getTitle());  
      System.out.println( driver.getWindowHandle());
     
        
   //     driver.manage().window().minimize();  
        Thread.sleep(2000);
    //    driver.manage().window().maximize();
        
 //       driver.navigate().refresh();
        driver.navigate().to("https://www.w3schools.com/java/java_type_casting.asp");
        
        Thread.sleep(2000);
        System.out.println( "Title for second page ="+driver.getTitle()); 
        System.out.println(driver.getWindowHandles()); 
         System.out.println(driver.getCurrentUrl());  
        
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        
        driver.quit();
	}

}
